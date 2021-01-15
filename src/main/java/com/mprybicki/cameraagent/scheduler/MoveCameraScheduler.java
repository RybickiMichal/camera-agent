package com.mprybicki.cameraagent.scheduler;

import com.mprybicki.cameraagent.model.PanTiltZoom;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@AllArgsConstructor
@Component
@Slf4j
public class MoveCameraScheduler {

    private Random random;

    private static PanTiltZoom actualPanTiltZoom = new PanTiltZoom(0.0, 0.0, 0.0);

    @Scheduled(fixedRateString = "${scheduler.camera.move.fixed.rate}")
    public void MoveCamera() {
        actualPanTiltZoom = new PanTiltZoom(generateRandomDouble(0.0, 360.0),
                generateRandomDouble(0.0, 360.0), generateRandomDouble(0.0, 30.0));
        log.info("Camera has changed position. New is " + actualPanTiltZoom.toString());
    }

    public PanTiltZoom getActualPanTiltZoom() {
        return actualPanTiltZoom;
    }

    private Double generateRandomDouble(Double rangeMin, Double rangeMax) {
        return rangeMin + (rangeMax - rangeMin) * random.nextDouble();
    }
}


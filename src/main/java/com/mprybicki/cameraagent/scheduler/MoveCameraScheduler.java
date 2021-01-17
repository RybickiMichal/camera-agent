package com.mprybicki.cameraagent.scheduler;

import com.mprybicki.cameraagent.model.PositionData;
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

    private static PositionData actualPositionData = new PositionData(50.0, 60.0, 14.0);

    @Scheduled(fixedRateString = "${scheduler.camera.move.fixed.rate}")
    public void MoveCamera() {
        actualPositionData = new PositionData(actualPositionData.getLat() + generateRandomDouble(-2.0, 2.0),
                actualPositionData.getLon() + generateRandomDouble(-2.0, 2.0), actualPositionData.getAltitude() + generateRandomDouble(-2.0, 2.0));
        log.info("Camera has changed position. New is " + actualPositionData.toString());
    }

    public PositionData getActualPositionData() {
        return actualPositionData;
    }

    private Double generateRandomDouble(Double rangeMin, Double rangeMax) {
        return rangeMin + (rangeMax - rangeMin) * random.nextDouble();
    }
}


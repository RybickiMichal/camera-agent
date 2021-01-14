package com.mprybicki.cameraagent.scheduler;

import com.mprybicki.cameraagent.model.PanTiltZoom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Slf4j
public class MoveCameraScheduler {

    private PanTiltZoom actualPanTiltZoom = new PanTiltZoom(0.0, 0.0, 0.0);
    private Random random = new Random();

    //TODO move ms value to properties
    @Scheduled(fixedRate = 1000)
    public void MoveCamera() {
        actualPanTiltZoom = new PanTiltZoom(generateRandomDouble(0.0,360.0),
                generateRandomDouble(0.0,360.0),generateRandomDouble(0.0,30.0));
        log.info("Camera has changed position. New is " + actualPanTiltZoom.toString());
    }

    public PanTiltZoom getActualPanTiltZoom(){
        return actualPanTiltZoom;
    }

    private Double generateRandomDouble(Double rangeMin, Double rangeMax){
        return rangeMin + (rangeMax - rangeMin) * random.nextDouble();
    }
}


package com.mprybicki.cameraagent.controller;

import com.mprybicki.cameraagent.model.PositionData;
import com.mprybicki.cameraagent.scheduler.MoveCameraScheduler;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CameraDataController {

    MoveCameraScheduler moveCameraScheduler;

    @GetMapping(value = "/position-data")
    public PositionData getActualPositionData() {
        return moveCameraScheduler.getActualPositionData();
    }

}

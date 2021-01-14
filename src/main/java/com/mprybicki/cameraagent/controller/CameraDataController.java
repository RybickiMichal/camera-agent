package com.mprybicki.cameraagent.controller;

import com.mprybicki.cameraagent.model.PanTiltZoom;
import com.mprybicki.cameraagent.scheduler.MoveCameraScheduler;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CameraDataController {

    MoveCameraScheduler moveCameraScheduler;

    @GetMapping(value = "/pan-tilt-zoom")
    public PanTiltZoom getActualCameraData() {
        return moveCameraScheduler.getActualPanTiltZoom();
    }

}

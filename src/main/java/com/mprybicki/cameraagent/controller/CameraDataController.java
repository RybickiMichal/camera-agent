package com.mprybicki.cameraagent.controller;

import com.mprybicki.cameraagent.model.PanTiltZoom;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CameraDataController {

    @GetMapping(value = "/pan-tilt-zoom")
    public PanTiltZoom getActualCameraData() {
        return new PanTiltZoom(18.0, 4.0, 5.0);
    }

}

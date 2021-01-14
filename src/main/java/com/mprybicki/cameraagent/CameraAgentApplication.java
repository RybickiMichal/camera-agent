package com.mprybicki.cameraagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CameraAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CameraAgentApplication.class, args);
    }

}

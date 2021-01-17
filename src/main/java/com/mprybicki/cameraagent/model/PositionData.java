package com.mprybicki.cameraagent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@ToString
public class PositionData {

    @NotNull
    double lat;

    @NotNull
    double lon;

    @NotNull
    double altitude;
}

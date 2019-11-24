package com.mughees;

import com.ebay.xcelite.annotations.Column;

import java.util.Date;


public class Write {

    @Column(name = "RPM")
    private String rpm;

    @Column(name = "Steering Angle")
    private String steeringAngle;

    @Column(name = "Gear No.")
    private long gearNum;

    @Column(name = "Throttle")
    private Date throttle;

}


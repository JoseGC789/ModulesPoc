package com.josegc789.simple.impl;

import com.josegc789.simple.function.PointOfView;
import org.springframework.stereotype.Component;

@Component("spring")
public class MySpringFunc implements PointOfView {

    @Override
    public String respond(String app) {
        return "Spring response " + app;
    }
}

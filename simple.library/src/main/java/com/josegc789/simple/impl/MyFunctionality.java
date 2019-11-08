package com.josegc789.simple.impl;

import com.josegc789.simple.function.PointOfView;

public class MyFunctionality implements PointOfView {

    @Override
    public String respond(String app) {
        return "Loader response " + app;
    }
}

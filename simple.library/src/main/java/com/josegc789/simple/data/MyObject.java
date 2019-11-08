package com.josegc789.simple.data;

public class MyObject {
    private String field;

    public MyObject(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "field='" + field + '\'' +
                '}';
    }
}

import com.josegc789.simple.function.PointOfView;

open module simple.web {
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires spring.context;
    requires simple.library;
    requires spring.beans;
    requires spring.boot;
    uses PointOfView;
}
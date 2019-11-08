import com.josegc789.simple.impl.MyFunctionality;

module simple.library {
    requires java.base;
    requires static spring.context;
    exports com.josegc789.simple.function;
    exports com.josegc789.simple.data;
    opens com.josegc789.simple.impl;
    provides com.josegc789.simple.function.PointOfView with MyFunctionality;
}
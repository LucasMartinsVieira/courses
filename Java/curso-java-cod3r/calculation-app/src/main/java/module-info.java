module calculation.app {
    requires transitive logging.app;
    exports br.com.cod3r.app.calculator;

//    exports br.com.cod3r.app.calculator.internal
//            to financial.app;

    opens br.com.cod3r.app.calculator to financial.app;

    requires app.api;
    provides br.com.cod3r.app.calculator
            with br.com.cod3r.app.calculator.CalculatorImpl;
}
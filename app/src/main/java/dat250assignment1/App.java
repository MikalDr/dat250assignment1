package dat250assignment1;

import io.javalin.Javalin;
import java.io.File;
import dat250assignment1.Website.*;

public class App {

    //Need a pretty way to load the html file into CTX
    // Does the variables (Constants) need their own file?
    private static final String WEBPAGE = Website.WEBPAGE;

    private static final double IN_TO_METER = 0.0254;
    private static final double FT_TO_METER = 0.3048;
    private static final double MI_TO_METER = 1609.344;


    public static void main(String[] args) {
        // Maybe seperate .get and .post content into their own functions.
        Javalin.create()
                .get("/", ctx -> {
                    ctx.html(WEBPAGE);
                })
                .post("/convert", ctx -> {
                    double value = Double.parseDouble(ctx.formParam("value"));
                    String fromUnit = ctx.formParam("sunit");
                    String toUnit = ctx.formParam("tunit");
                    double result = UnitConverter.unitConversion(value, toUnit, fromUnit);
                    ctx.result(Double.toString(result));
                })
                .start(9000);
    }
}
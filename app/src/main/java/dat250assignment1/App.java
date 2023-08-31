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
                    double inMeters;
                    if (fromUnit.equals("in")) {
                        inMeters = value * IN_TO_METER;
                    } else if (fromUnit.equals("ft")) {
                        inMeters = value * FT_TO_METER;
                    } else if (fromUnit.equals("mi")) {
                        inMeters = value * MI_TO_METER;
                    } else if (fromUnit.equals("m")) {
                        inMeters = value;
                    } else {
                        inMeters = Double.NaN;
                    }
                    double result;
                    if (toUnit.equals("in")) {
                        result = inMeters / IN_TO_METER;
                    } else if (toUnit.equals("ft")) {
                        result = inMeters / FT_TO_METER;
                    } else if (toUnit.equals("mi")) {
                        result = inMeters / MI_TO_METER;
                    } else if (toUnit.equals("m")) {
                        result = inMeters;
                    } else {
                        result = Double.NaN;
                    }
                    ctx.result(Double.toString(result));
                })
                .start(9000);
    }


}
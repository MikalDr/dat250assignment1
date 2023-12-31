package dat250assignment1;

/**
 * A class for unit conversion methods.
 * Methods:
 * unitConversion
 */
public class UnitConverter {
    private static final double IN_TO_METER = 0.0254;
    private static final double FT_TO_METER = 0.3048;
    private static final double MI_TO_METER = 1609.344;

    /**
     * Converts a value (double) into different units of measure
     * @param inValue - the starting value
     * @param toUnit - the unit you want to convert to
     * @param fromUnit - the starting unit type
     * @return
     */
    protected static double unitConversion(double inValue,String toUnit, String fromUnit){
        double value = inValue;
        switch (fromUnit){
            case "in":
                value = value * IN_TO_METER;
                break;
            case "ft":
                value = value * FT_TO_METER;
                break;
            case "mi":
                value = value * MI_TO_METER;
                break;
        }
            System.out.println(value);
        return switch (toUnit) {
            case "in" -> value / IN_TO_METER;
            case "ft" -> value / FT_TO_METER;
            case "mi" -> value / MI_TO_METER;
            case "m" -> value;
            default -> Double.NaN;
        };
    }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dat250assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void ConversionTest(){
        assertEquals(0.0508,UnitConverter.unitConversion(2, "m", "in"));
        assertEquals(5280, UnitConverter.unitConversion(1, "ft", "mi"));
    }
}

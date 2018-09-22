package romanNumeralGeneratorMain;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by robflett on 22/09/2018.
 */
public class NumberToNumeralGeneratorTest {

    @BeforeClass
    public static void setUp(){
    }


//    Test to check if simple numbers - contained in the RomanNumerals.java class - return as expected
    @Test
    public void testReturningExpectedSimpleNumbers() {

        NumberToNumeralGenerator numberToNumeralGenerator = new NumberToNumeralGenerator();

        String one = numberToNumeralGenerator.generate(1);
        assertEquals("Test to return expected number:", "I", one);

        String four = numberToNumeralGenerator.generate(4);
        assertEquals("Test to return expected number:", "IV", four);

        String fifty = numberToNumeralGenerator.generate(50);
        assertEquals("Test to return expected number:","L", fifty);

        String nineHundred = numberToNumeralGenerator.generate(900);
        assertEquals("Test to return expected number:","CM", nineHundred);

    }

//    Test to check if combined numbers are returning as expected
    @Test
    public void testReturningExpectedCombinedNumbers() {

        NumberToNumeralGenerator numberToNumeralGenerator = new NumberToNumeralGenerator();

        String eleven = numberToNumeralGenerator.generate(11);
        assertEquals("Test to return expected number:", "XI", eleven);

        String fourtyTwo = numberToNumeralGenerator.generate(42);
        assertEquals("Test to return expected number:", "XLII", fourtyTwo);

        String threeHundredAndFour = numberToNumeralGenerator.generate(304);
        assertEquals("Test to return expected number:","CCCIV", threeHundredAndFour);

        String oneThousandNineHundredAndTwelve = numberToNumeralGenerator.generate(1912);
        assertEquals("Test to return expected number:","MCMXII", oneThousandNineHundredAndTwelve);

    }

//    Test to confirm that Exception is returned when number is below one
    @Test (expected = IllegalArgumentException.class)
    public void testReturningErrorMessageWhenNumberIsBelowOne() {

        NumberToNumeralGenerator numberToNumeralGenerator = new NumberToNumeralGenerator();

        numberToNumeralGenerator.generate(0);

    }

//    Test to confirm that Exception is returned when number is above 3999
    @Test (expected = IllegalArgumentException.class)
    public void testReturningErrorMessageWhenNumberIsAbove3999() {

        NumberToNumeralGenerator numberToNumeralGenerator = new NumberToNumeralGenerator();

        numberToNumeralGenerator.generate(4000);

    }


//    Test to confirm that Exception is returned when number is far above 3999
    @Test (expected = IllegalArgumentException.class)
    public void testReturningErrorMessageWhenNumberIsFarAbove3999() {

        NumberToNumeralGenerator numberToNumeralGenerator = new NumberToNumeralGenerator();

        numberToNumeralGenerator.generate(17006);

    }

}
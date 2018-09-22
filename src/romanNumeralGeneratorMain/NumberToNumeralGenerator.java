package romanNumeralGeneratorMain;

/**
 *
 * This solution uses TreeMap and is heavily reliant on the floorKey method within it.
 * The floorKey method checks through the TreeMap looking for the closest match to the given number
 * This method then takes that closest match and subtracts it from the given number
 * generate then runs again using the given number minus the numberFound and runs again
 * This continues until the exact match of numberFound and number is given - it then returns that numeral as a string
 *
 *
 */

/**
 * Created by robflett on 22/09/2018.
 */
public class NumberToNumeralGenerator implements RomanNumeralGenerator {

    private RomanNumerals numerals = new RomanNumerals();

    @Override
    public String generate(int number) {

//        First check if the provided parameter is valid
//        If statements to check if the provided number parameter falls between 1 and 3999
        if(number < 1) throw new IllegalArgumentException("The provided number must be 1 or greater");
        if(number > 3999) throw new IllegalArgumentException("The provided number must be 3999 or less");

//        Then go through the map to match the number
//        using TreeMap, map, in RomandNumerals to match against the closest number provided
//        The floorKey method is used on the map as this keeps going through the map looking for the closet key-value pair
        int numberFound = (int)(numerals.map.floorKey(number));

//        If the number directly matches that used in the RomanNumerals map - return the string of that number
        if(numberFound == number) return numerals.map.get(number).toString();

//        Continue iterating through the map until the whole numeral is built up
        return numerals.map.get(numberFound).toString() + generate(number - numberFound);

    }
}

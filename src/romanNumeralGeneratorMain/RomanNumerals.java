package romanNumeralGeneratorMain;

import java.util.TreeMap;


/**
 * In this class I have seperated out my definitions of numbers and numerals.
 * After researching the best way to do this I have decided to use a TreeMap (something I was not aware of before attempting this kata)
 *
 * The TreeMap acts like a HashMap but orders the the collection in ascending order of its keys - keeping code readable
 *
 *
 */

/**
 * Created by robflett on 22/09/2018.
 */
public class RomanNumerals {

    public static TreeMap map = new TreeMap();

    static {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }


}
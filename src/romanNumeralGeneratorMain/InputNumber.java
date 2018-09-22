package romanNumeralGeneratorMain;

import java.util.Scanner;

/**
 *
 * Using Scanner for input as it handles...
 *
 */

/**
 * Created by robflett on 22/09/2018.
 */
public class InputNumber {

    private static Scanner scanner = null;

    public static int getNumber() throws NumberFormatException {
        scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine().toUpperCase());
    }

}

package romanNumeralGeneratorMain;

/**
 *
 * Entrypoint for the Program - user can enter numbers between 1 and 3999 or type 0 to exit
 * If user enters an invalid number then an IllegalArgumentException is thrown
 *
 */

/**
 * Created by robflett on 22/09/2018.
 */
public class Main {

    private final static String INSTRUCTIONS = "\nPlease enter a number between 1 and 3999 or type 0 to quit \n" + "\nEnter value to be converted to roman notation: \n";
    private final static String EXIT = "\nThank you for using NumberToNumeralGenerator\n";

    public static void main(String[] args) {

        NumberToNumeralGenerator numberToNumeralGenerator = new NumberToNumeralGenerator();

        int number = 0;
        do {
            System.out.print(INSTRUCTIONS);

            number = InputNumber.getNumber();

//            Option to exit when the user types '0'
            if (number == 0)
                break;
            System.out.println(numberToNumeralGenerator.generate(number));


        } while (true);
        System.out.println(EXIT);
    }

}

// When over 3999 is added the IllegalArgumentException kicks in - add further instructions
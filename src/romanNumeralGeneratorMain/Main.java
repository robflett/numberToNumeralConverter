package romanNumeralGeneratorMain;

/**
 * Created by robflett on 22/09/2018.
 */
public class Main {

    private final static String INSTRUCTIONS = "\nPlease enter a number between 1 and 3999 or input 0 to quit \n" + "\nEnter value to be converted to roman notation: \n";
    private final static String EXIT = "\nThank you for using NumberToNumeralGenerator\n";

    public static void main(String[] args) {

        NumberToNumeralGenerator numberToNumeralGenerator = new NumberToNumeralGenerator();

        int number = 0;
        do {
            System.out.print(INSTRUCTIONS);

            number = InputNumber.getNumber();

            if (number == 0)
                break;
            System.out.println(numberToNumeralGenerator.generate(number));


        } while (true);
        System.out.println(EXIT);
    }

}

// When over 3999 is added the IllegalArgumentException kicks in - add further instructions
# Number to Numeral Converter in Java

Number to Numeral Converter in Java

# Rob Flett 

# Brief
In  whatever  language  you  prefer,  write  a  class  that  implements  the  following  interface  (example  given  in  Java):  
```
public  interface  RomanNumeralGenerator  {        public  String  generate(int  number);    }  
```
For  example,  see  the  following  sample  inputs  and  outputs:
- 1  =  “I” 
- 5  =  “V” 
- 10  =  “X” 
- 20  =  “XX” 
- 3999  =  “MMMCMXCIX”

Caveat:  Only  support  numbers  between  1  and  3999    

# Tools:
- Java
- JUnit
- Sonarlint
- Built in intelliJ IDE

# Development
The brief just asks for a class to be written that implements the given interface. I chose to go further and create a fully tested program with the option for a user to enter a number in the console and see it return the correct Roman Numeral.

I chose Java, to implement this kata, as it's the language I am most familiar with. I'm also familiar with JUnit which I used as my testing framework.

I began by integrating the given interface for the Roman Numeral Generator. It is implemented by the NumberToNumeralGenerator class - which accesses it and overrides the method.

In this class I have seperated out my definitions of numbers and numerals into it's own class. After researching the best way to do this I have decided to use a TreeMap (something I was not aware of before attempting this kata). The TreeMap acts like a HashMap but orders the the collection in ascending order of its keys - keeping code readable.
TreeMap's floorKey method checks through the TreeMap looking for the closest match to the given number, it then takes that closest match and subtracts it from the given number. The generate method then runs again using the given number minus the numberFound.
This continues until the exact match of numberFound and number is given - it then returns that numeral as a string.

The Main class is the entrypoint for the Program - the user is instructed that they can enter numbers between 1 and 3999 or type 0 to exit.
If the user enters an invalid number then an IllegalArgumentException is thrown.

# Future
I will look further into the TreeMap collection as I had not encountered it before. I will also read more into the the case-based advantages and disadvantages of using Scanner over BufferedReader for console input. 

I'd like to learn more into some of the minor issues brought up by Sonarlint - such as the advantages of using a map object as an interface rather than an implementation.

  
# Setup 
Unzip the file into your chosen directory.
To compile the program navigate to the src/romannumeralgeneratormain folder and type:
```
javac *.java 
```

To run the program navigate to the src folder and type:
```
java -cp . romannumeralgeneratormain.Main
```

To run test(s) please open the package within an IDE and run directly from there.


Alternatively, to compile, you can navigate to the test/romannumeralgeneratormain folder and type:
```
javac *.java
```

To run the tests navigate to the test folder above the romannumeralgeneratormain folder and then type:
```
java -cp . org.junit.runner.JUnitCore romannumeralgeneratormain.NumberToNumeralTest
```

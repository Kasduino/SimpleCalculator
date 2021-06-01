import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.util.Scanner;

public class calculatorbasic {
    public static void main(String[] args) throws InterruptedException {
        // Create Scanner object.
        Scanner calculatorScanner = new Scanner(System.in); //scanner is a class that can take input from the user, we called ours calculatorScanner. This defines calculatorScanner as a new Scanner.
        

        // Variables
        double firstNumber; //defines firstNumber as a double
        double secondNumber; // defines secondNumber as a double
        String operation; //defines operation as a string

        //     First Section  (asks for number one)
        System.out.println("Welcome to calculator");
        // Delays time for 3 seconds.
        Thread.sleep(3000);
        System.out.print("\033[2J"); // Clear Screen.

         try {
            System.out.println("Select a number");
            firstNumber = calculatorScanner.nextDouble();
            System.out.println("\033[2J"); // Clear Screen

            //      Second Section (asks for number two)
            System.out.println("Select another number");
            secondNumber = calculatorScanner.nextDouble();
            System.out.print("\033[2J"); // Clear Screen

            } catch (Exception error) {
                // Alert user of error.
                System.out.print("Please enter a decimal or integer.");       //Forces the user to input only a number 
            }
        }

        //      Third Section (asks for the operation)
        System.out.println("Pick an operation");
        Thread.sleep(300);
        System.out.println("addition");
        Thread.sleep(300);
        System.out.println("subtraction");
        Thread.sleep(300);
        System.out.println("multiplication");
        Thread.sleep(300);
        System.out.println("division");
        operation = calculatorScanner.next();


        //      If Statements
        if (operation.toLowerCase().equals("addition")) {
            System.out.println(firstNumber + secondNumber);
        } else if (operation.toLowerCase().equals("subtraction")) {
            System.out.println(firstNumber - secondNumber);
        } else if (operation.toLowerCase().equals("multiplication")) {
            System.out.println(firstNumber * secondNumber);
        } else if (operation.toLowerCase().equals("division")) {
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Not an operation, restarting program...");
            Thread.sleep(3000);
        }
        
        
    }

    void calculate() {
        //      If Statements
        if (operation.toLowerCase().equals("addition")) {       // if statement for addition
            System.out.println(firstNumber + secondNumber);
        } else if (operation.toLowerCase().equals("subtraction")) {     // if statement for subtraction
            System.out.println(firstNumber - secondNumber);
        } else if (operation.toLowerCase().equals("multiplication")) {      // if statement for multiplication
            System.out.println(firstNumber * secondNumber);
        } else if (operation.toLowerCase().equals("division")) {        // if statement for division
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Not an operation, restarting program...");
            Thread.sleep(10000);
            calculate();
        }
        
    }
}

//Any questions, any recommendations, ask in the GitHub
//https://github.com/Kasduino/SimpleCalculatorForBeginners

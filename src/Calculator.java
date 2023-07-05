import java.util.Scanner;

// Run 'Calculator.java'.

// Simple Java Calculator
// Made by https://github.com/pepijngbr

//TODO:
// Add validation when entering String as number,
// Add double support,
// Repeat/Loop Calculator,

public class Calculator {
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        String operator;

        Scanner input = new Scanner(System.in);

        System.out.print("----------\n");
        System.out.print("Simple Java Calculator \n");
        System.out.print("Made by https://github.com/pepijngbr \n");
        System.out.print("This is my Simple Calculator made in Java, a language I have no experience with. \n\n");
        System.out.print("Enter one of the operators, following up enter two numbers. \n");


        System.out.print("----------\n");
        System.out.print("Operators: \n");
        System.out.print("+  ➡  Addition\n");
        System.out.print("-  ➡  Subtraction\n");
        System.out.print("*  ➡  Multiplication\n");
        System.out.print("/  ➡  Division\n");
        System.out.print("----------\n");

        System.out.print("Enter operator: ");
        operator = input.next(); // Enter operator as String

        switch(operator){
            case "+":
                System.out.print("\nAdding two numbers\n");

                System.out.print("Enter first number: ");
                firstNumber = input.nextInt(); // Enter firstNumber as int

//                System.out.print("Enter second number: ");
                System.out.printf("Add number to " + firstNumber + ": ");
                secondNumber = input.nextInt(); // Enter secondNumber as int

                System.out.print("\n----------\n");

                System.out.printf(firstNumber + " + " + secondNumber + "\n");
                System.out.print("Outcome: ");
                System.out.println(add(firstNumber, secondNumber)); // Print outcome from addition
                break;
            case "-":
                System.out.print("\nSubtracting.\n");

                System.out.print("Enter first number: ");
                firstNumber = input.nextInt(); // Enter firstNumber as int

//                System.out.printf("Enter second number: ");
                System.out.printf("Subtract number from " + firstNumber + ": ");
                secondNumber = input.nextInt(); // Enter secondNumber as int

                System.out.print("\n----------\n");

                System.out.printf(firstNumber + " - " + secondNumber + "\n");
                System.out.print("Outcome: ");
                System.out.println(subtract(firstNumber, secondNumber)); // Print outcome from subtraction
                break;
            case "*":
                System.out.print("\nMultiplying two numbers.\n");

                System.out.print("Enter first number: ");
                firstNumber = input.nextInt(); // Enter firstNumber as int

//                System.out.printf("Enter second number: ");
                System.out.printf("Multiply number with " + firstNumber + ": ");
                secondNumber = input.nextInt(); // Enter secondNumber as int

                System.out.print("\n----------\n");

                System.out.printf(firstNumber + " * " + secondNumber + "\n");
                System.out.print("Outcome: ");
//                Calculate(FirstNumber, SecondNumber);
                System.out.println(multiply(firstNumber, secondNumber)); // Print outcome from multiplication
                break;
            case "/":
                System.out.print("\nDividing.\n");

                System.out.print("Enter first number: ");
                firstNumber = input.nextInt();

//                System.out.printf("Enter second number: ");
                System.out.printf("Divide number with " + firstNumber + ": ");
                secondNumber = input.nextInt(); // Enter secondNumber as int

                System.out.print("\n----------\n");

                System.out.printf(firstNumber + " / " + secondNumber + "\n");
                System.out.print("Outcome: ");
                System.out.println(divide(firstNumber, secondNumber)); // Print outcome from division
                break;
            default:
                System.out.print("Enter a valid operator.");
                break;
        }
    }
    public static int add(int num1, int num2)
    {
//        int result = num1 + num2;
//        return result;
        return num1 + num2;
    }
    public static int subtract(int num1, int num2)
    {
//        int result = num1 - num2;
//        return result;
        return num1 - num2;
    }
    public static int multiply(int num1, int num2)
    {
//        int result = num1 * num2;
//        return result;
        return num1 * num2;
    }
    public static int divide(int num1, int num2)
    {
//        int result = num1 / num2;
//        return result;
        return num1 / num2;
    }
}

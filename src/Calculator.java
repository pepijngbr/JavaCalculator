import java.util.Scanner;

// Run 'Calculator.java'.

// Simple Java Calculator
// Made by https://github.com/pepijngbr

//TODO: Add validation when entering String as number
//TODO: Add double support

public class Calculator {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        String userInput;

        Scanner input = new Scanner(System.in);

        System.out.print("----------\n");
        System.out.print("Simple Java Calculator \n");
        System.out.print("Made by https://github.com/pepijngbr \n");
        System.out.print("This is my Simple Calculator made in Java, a language I have no experience with. \n\n");

        while (true) {
            System.out.print("Enter one of the operators, following up enter two numbers. \n");

            System.out.print("----------\n");
            System.out.print("Operators: \n");
            System.out.print("+  ➡  Addition\n");
            System.out.print("-  ➡  Subtraction\n");
            System.out.print("*  ➡  Multiplication\n");
            System.out.print("/  ➡  Division\n");
            System.out.print("----------\n");
            System.out.print("'exit' or 'close'  ➡  Exit application.\n");
            System.out.print("----------\n");

            System.out.print("Input: ");
            userInput = input.next(); // Enter operator as String

            switch (userInput) {
                case "+" -> {
                    System.out.print("\nAdding two numbers\n");

                    System.out.print("Enter first number: ");
                    firstNumber = input.nextInt(); // Enter firstNumber as int

                    System.out.printf("Add amount to " + firstNumber + ": ");
                    secondNumber = input.nextInt(); // Enter secondNumber as int

                    System.out.print("\n----------\n");
                    System.out.printf(firstNumber + " + " + secondNumber + "\n");
                    System.out.print("Outcome: ");
                    System.out.println(add(firstNumber, secondNumber)); // Print outcome from addition
                }
                case "-" -> {
                    System.out.print("\nSubtracting.\n");

                    System.out.print("Enter first number: ");
                    firstNumber = input.nextInt(); // Enter firstNumber as int

                    System.out.printf("Subtract amount from " + firstNumber + ": ");
                    secondNumber = input.nextInt(); // Enter secondNumber as int

                    System.out.print("\n----------\n");
                    System.out.printf(firstNumber + " - " + secondNumber + "\n");
                    System.out.print("Outcome: ");
                    System.out.println(subtract(firstNumber, secondNumber)); // Print outcome from subtraction
                }
                case "*" -> {
                    System.out.print("\nMultiplying two numbers.\n");

                    System.out.print("Enter first number: ");
                    firstNumber = input.nextInt(); // Enter firstNumber as int

                    System.out.printf("Multiply amount with " + firstNumber + ": ");
                    secondNumber = input.nextInt(); // Enter secondNumber as int

                    System.out.print("\n----------\n");
                    System.out.printf(firstNumber + " * " + secondNumber + "\n");
                    System.out.print("Outcome: ");
                    System.out.println(multiply(firstNumber, secondNumber)); // Print outcome from multiplication
                }
                case "/" -> {
                    System.out.print("\nDividing.\n");

                    System.out.print("Enter first number: ");
                    firstNumber = input.nextInt();

                    System.out.printf("Divide amount with " + firstNumber + ": ");
                    secondNumber = input.nextInt(); // Enter secondNumber as int

                    System.out.print("\n----------\n");
                    System.out.printf(firstNumber + " / " + secondNumber + "\n");
                    System.out.print("Outcome: ");
                    System.out.println(divide(firstNumber, secondNumber)); // Print outcome from division
                }
                case "exit", "close" -> System.exit(1);
                default -> System.out.print("Error: Enter a valid operator.\n");
            }
            System.out.print("----------\n");
            System.out.print("\n");
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}

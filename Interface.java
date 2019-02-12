import java.util.Scanner;

public class Interface {
    private String operation;
    private int firstNumber;
    private int secondNumber;

    Scanner scanner = new Scanner(System.in);

    public String setOperation() {
        System.out.println("Would you like to add, subtract, multiply, divide, or pow?");
        operation = scanner.nextLine();
        return operation;
    }

    public int setFirstNumber() {
        System.out.println("What is the first number you would like to " + operation);
        firstNumber = scanner.nextInt();
        return firstNumber;
    }

    public int setSecondNumber() {
        System.out.println("What is the second number you would like to " + operation);
        secondNumber = scanner.nextInt();
        return secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public boolean operationIsCorrect() {
        System.out.printf("Is %s %s %s what you wanted to do?%n", Integer.toString(firstNumber), operation, Integer.toString(secondNumber));
        System.out.println("Please type y for yes or n for no.");
        char correctAsChar = scanner.next().charAt(0);
        if (correctAsChar == 'y') {
            return true;
        } else if (correctAsChar == 'n') {
            return false;
        } else {
            throw new IllegalArgumentException("Unable to determine response");
        }
    }
}
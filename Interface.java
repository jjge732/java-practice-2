import java.util.Scanner;

public class Interface {
    private String operation;
    private int firstNumber;
    private int secondNumber;

    Scanner sc = new Scanner(System.in);

    public String getOperation() {
        System.out.println("Would you like to add, subtract, mulitply, or divide?");
        operation = sc.nextLine();
        return operation;
    }

    public int setFirstNumber() {
        System.out.println("What is the first number you would like to " + operation);
        firstNumber = Integer.parseInt(sc.nextLine());
        return firstNumber;
    }

    public int setSecondNumber() {
        System.out.println("What is the second number you would like to " + operation);
        secondNumber = Integer.parseInt(sc.nextLine());
        return secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public boolean operationIsCorrect() {
        System.out.printf("Is %s %s %s what you wanted to do?%n", Integer.toString(firstNumber), operation, Integer.toString(secondNumber));
        System.out.println("Please type yes or no.");
        String correctAsString = sc.nextLine();
        if (correctAsString == "yes") {
            return true;
        } else if (correctAsString == "no") {
            return false;
        } else {
            throw new IllegalArgumentException("Unable to determine response");
        }
    }
}
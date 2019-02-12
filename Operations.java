public class Operations {
    private int answer;

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public int performOperation(String operation, int firstNumber, int secondNumber) {
        switch(operation) {
            case "add":
                answer = add(firstNumber, secondNumber);
                break;
            case "subtract":
                answer = subtract(firstNumber, secondNumber);
                break;
            case "multiply":
                answer = multiply(firstNumber, secondNumber);
                break;
            case "divide":
                answer = divide(firstNumber, secondNumber);
                break;
            default:
                throw new IllegalArgumentException("Operation not recognized. Please Try again");
        }
        return answer;
    }
}
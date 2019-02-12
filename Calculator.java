class Calculator {
    public static void main(String[] args) {
        int answer = 0;
        Operations operations = new Operations();
        Interface view = new Interface();

        view.setOperation();
        view.setFirstNumber();
        view.setSecondNumber();

        switch(view.getOperation()) {
            case "add":
                if (view.operationIsCorrect()) {
                    answer = operations.add(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            case "subtract":
                if (view.operationIsCorrect()) {
                    answer = operations.subtract(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            case "multiply":
                if (view.operationIsCorrect()) {
                    answer = operations.multiply(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            case "divide":
                if (view.operationIsCorrect()) {
                    answer = operations.divide(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            default:

                break;
        }
        System.out.println(answer);
    }
}
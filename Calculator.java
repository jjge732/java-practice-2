class Calculator {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Interface view = new Interface();

        view.setOperation();
        view.setFirstNumber();
        view.setSecondNumber();

        if (view.operationIsCorrect()) {
            try {
                System.out.printf("The answer is %d!%n", operations.performOperation(view.getOperation(), view.getFirstNumber(), view.getSecondNumber()));
            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        } else {
            System.out.println("Okay, let's start over");
        }
    }
}
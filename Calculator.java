class Calculator {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Interface view = new Interface();

        switch(view.getOperation()) {
            case "add":
                if (view.operationIsCorrect()) {
                    operations.add(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            case "subtract":
                if (view.operationIsCorrect()) {
                    operations.subtract(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            case "mulitply":
                if (view.operationIsCorrect()) {
                    operations.multiply(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            case "divide":
                if (view.operationIsCorrect()) {
                    operations.divide(view.getFirstNumber(), view.getSecondNumber());
                } else {
                    System.out.println("Okay, let's start over");
                }
                break;
            default:

                break;
        }
    }
}
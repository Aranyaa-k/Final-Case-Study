public class calc {
    private double number1;
    private double number2;

    // Getter for number1
    public double getNumber1() {
        return number1;
    }

    // Setter for number1
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    // Getter for number2
    public double getNumber2() {
        return number2;
    }

    // Setter for number2
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    // Method to add the two numbers
    public double add() {
        return number1 + number2;
    }

    // Method to subtract the two numbers
    public double subtract() {
        return number1 - number2;
    }

    // Method to multiply the two numbers
    public double multiply() {
        return number1 * number2;
    }

    // Method to divide the two numbers
    public double divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setNumber1(10);
        calc.setNumber2(5);
        System.out.println("Answers:");
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}

public class Calculator {

    // Adds two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Subtracts second number from first
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplies two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divides first number by second, with zero check
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Main method for quick testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
    }
}

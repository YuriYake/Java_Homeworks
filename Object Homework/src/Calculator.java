public class Calculator {

    String name;

    public Calculator(String name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator calculator =
                new Calculator("My Calculator");

        System.out.println(calculator.add(5, 10));

        System.out.println(calculator.add(5.5, 10.5));

        System.out.println(calculator.add(5, 10, 20));
    }
}
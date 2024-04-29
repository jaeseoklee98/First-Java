package week03.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(new AddOperation());
        System.out.println(calc.calculate(10, 20));
        calc.setOperation(new MultiplyOperation());
        System.out.println(calc.calculate(10, 20));
    }
}

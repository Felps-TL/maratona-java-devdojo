package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String... args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};
        calculator.addArray(numbers);
        calculator.addVarArgs(1,2,3,4,5);
    }
}

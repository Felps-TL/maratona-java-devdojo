package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addTwoNumbers();
        System.out.println("Finalizing CalculatorTest01");
        calculator.subtractsTwoNumbers();
    }
}

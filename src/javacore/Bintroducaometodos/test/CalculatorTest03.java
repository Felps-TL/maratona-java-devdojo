package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 0);
        System.out.println(result);
        System.out.println("--------------");
        calculator.printDivisionTwoNumbers(86 , 0);
    }
}
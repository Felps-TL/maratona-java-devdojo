package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 1;
        int num2 = 2;
        calculator.changesTwoNumbers(num1 , num2);
        System.out.println("----------------------------");
        System.out.println("Inside the CalculatorTest04");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}

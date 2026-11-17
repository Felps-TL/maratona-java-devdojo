package javacore.Bintroducaometodos.domain;

public class Calculator {

    public void addTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractsTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num, int num2) {
        System.out.println(num * num2);

    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return (num1 / num2);

    }

    public void printDivisionTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division by zero does not exist");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changesTwoNumbers (int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Inside the changesTwoNumbers");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}

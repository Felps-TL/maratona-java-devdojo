/*
 * Given the price of a car, find out how many installments it can be divided into.
 * Condition installmentAmount >= 1000
 */

import java.util.Scanner;

public class aula30Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the car: R$");
        double carValue = scanner.nextDouble();
        for (int installment = 1; installment <= carValue; installment++) {
            double installmentAmount = carValue / installment;
            if (installmentAmount < 1000) {
                break;
            }
            System.out.println("Installment " + installment + " R$" + installmentAmount);
        }
    }
}

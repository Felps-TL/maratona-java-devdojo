/*
 * I want to know how much I have to pay in the Brazil 2026 based on my annual salary
 */

import java.util.Scanner;

public class aula24pt05impostoderenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your annual salary: ");
        double annualSalary = scanner.nextDouble();
        if (annualSalary <= 29145.60) {
            System.out.println("There is no taxation!");

        } else if (annualSalary >= 29145.61 && annualSalary <= 33919.80) {
            System.out.println("With a 7.5% tax rate, the discount will be: R$" + annualSalary * 0.075);

        } else if (annualSalary >= 33919.81 && annualSalary <= 45012.60) {
            System.out.println("With a 15% tax rate, the discount will be: R$" + annualSalary * 0.15);

        } else if (annualSalary >= 45012.61 && annualSalary <= 55976.16) {
            System.out.println("With a 22.5% tax rate, the discount will be: R$" + annualSalary * 0.225);

        } else {
            System.out.println("With a 27.5% tax rate, the discount will be: R$" + annualSalary * 0.275);
        }
    }
}

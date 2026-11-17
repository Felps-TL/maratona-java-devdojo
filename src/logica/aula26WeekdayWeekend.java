package logica;/*
 * Given values from 1 to 7, print whether it is a weekday or a weekend.
 */

import java.util.Scanner;

public class aula26WeekdayWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("It's sunday: Weekend!");
                break;
            case 2:
                System.out.println("It's monday: Weekday!");
                break;
            case 3:
                System.out.println("It's tuesday: Weekday!");
                break;
            case 4:
                System.out.println("It's wednesday: Weekday!");
                break;
            case 5:
                System.out.println("It's thursday: Weekday!");
                break;
            case 6:
                System.out.println("It's friday: Weekday!");
                break;
            case 7:
                System.out.println("It's saturday: Weekend");
                break;
            default:
                System.out.println("This choice is not valid!");
                break;
        }
    }
}

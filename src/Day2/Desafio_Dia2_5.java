package Day2;

import java.util.Scanner;

public class Desafio_Dia2_5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int years;
        int months;
        int days;
        int totalDays;
        System.out.println("Type your age in years: ");
        years = Integer.parseInt(sc.nextLine());
        System.out.println("Type how many months passed since your birthday month: ");
        months = Integer.parseInt(sc.nextLine());
        System.out.println("Type how many days passed since your birthday day of the month");
        days = Integer.parseInt(sc.nextLine());
        totalDays = ( years * 365 ) + ( months * 30 ) + ( days );
        System.out.printf("\nYou have %d years, %d months and %d days of age. This is %d days of life", years, months, days, totalDays);





        sc.close();

    }

}

package doneHomework1;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int earlyHour;
        int lateHour;
        System.out.println("Enter the day you want to arrive");
        day = scanner.nextInt();
        System.out.println("Enter the earliest time you can arrive");
        earlyHour = scanner.nextInt();
        System.out.println("Enter the latest time you can arrive");
        lateHour = scanner.nextInt();
        if (day >= 1 && day <= 5 && day != 3) {
        } else if (earlyHour >= 9.00 && earlyHour <= 17) {
            System.out.println("Confirmation");
        }else
        {  System.out.println("");}

    }}

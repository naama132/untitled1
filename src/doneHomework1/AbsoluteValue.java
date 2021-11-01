package doneHomework1;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberAbsoluteValue;
        System.out.println("Enter the number you want to see what its absolute value");
        numberAbsoluteValue = scanner.nextInt();
        {
            if (numberAbsoluteValue >= 0) {
                System.out.println("The absolute value is" + numberAbsoluteValue);
            } else {
                System.out.println("The absolute value is" + numberAbsoluteValue * -1);
            }

        }
    }

    public static class AscendingOrder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1;
            int num2;
            int num3;
            System.out.println("Enter the first number");
            num1 = scanner.nextInt();
            System.out.println("Enter the second number");
            num2 = scanner.nextInt();
            System.out.println("Enter the third number");
            num3 = scanner.nextInt();
            int theBiggest = Math.max(num1, num2);
            theBiggest = Math.max(theBiggest, num3);
            int theSmallest = Math.min(num1, num2);
            theSmallest = Math.min(theSmallest, num3);
            int sum= num1+num2+num3;
            int sumMimiAndMax= theBiggest+theSmallest;
            int middleNum = sum-sumMimiAndMax;
            System.out.println("The ascending order is mini-" + theSmallest + " middle-" + middleNum + " max-" + theBiggest);

        }
    }
}


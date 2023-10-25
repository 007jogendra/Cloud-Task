package com.pro.java;
import java.util.Scanner;

public class Romann {
    public static int romanToInteger(String roman) {
        int result = 0;

        int[] values = new int[128]; 
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = values[roman.charAt(i)];

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int integer = romanToInteger(romanNumeral);

        System.out.println("The integer value of " + romanNumeral + " is " + integer);
        scanner.close();
    }
}





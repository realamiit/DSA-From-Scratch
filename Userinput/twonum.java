package Userinput;

import java.util.Scanner;

public class twonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        float firstNumber = sc.nextFloat();
        System.out.println("Enter your second number");
        float secondNumber = sc.nextFloat();
        float result = (float) (firstNumber + secondNumber);
        System.out.println("Your value is: "+result);
        sc.close();

    }
}

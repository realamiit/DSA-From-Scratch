package Userinput;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        for (int a = 11; a <= n; a++) {
//            System.out.println(n + "*" + a + "=" + a * n);
//        }

        //1+2+3+4+5=15

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 2 * i;
        }
        System.out.println("sum is " + sum);

    }
}

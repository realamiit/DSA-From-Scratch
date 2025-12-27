package Patterns;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
//        its a practice sorry
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of digits");
//        int firstNumber = sc.nextInt();
//        System.out.println("Enter the number of digits");
//        int secondNumber = sc.nextInt();
//        System.out.println("Enter the number of digits");
//        int thirdNumber = sc.nextInt();
//        int result = (thirdNumber +  firstNumber);
//        System.out.println("Your value is: "+result);

        int m =3;
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}

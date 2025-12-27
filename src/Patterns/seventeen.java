package Patterns;

import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
//        int n=6; somthing different
//        Scanner input=new Scanner(System.in);
//        int n = input.nextInt();
        for(int i=1;i<=7;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=6; i++){
            for(int j=6; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

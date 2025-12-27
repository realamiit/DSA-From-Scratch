package Patterns;

import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
//        int n=7;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}


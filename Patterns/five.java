package Patterns;

import java.util.Scanner;
public class five {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  *");
            }
            System.out.println( );
        }
    }
}

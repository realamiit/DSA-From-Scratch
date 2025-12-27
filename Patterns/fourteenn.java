package Patterns;
import java.util.Scanner;
public class fourteenn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();

//        int n = 7;
        for(int i=0; i< n ; i++) {
//             space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
//            star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//      second step

            for(int i=0;i<n;i++) {
//            space
                for (int j=0; j < i; j++) {
                    System.out.print(" ");
                }
//        star
                for(int j=0; j < 2*(n-i)-1; j++){
                    System.out.print("*");
                }
//        next line
                System.out.println();
            }
    }
}
//
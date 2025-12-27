//package methods;
//
//import java.util.Scanner;
//
//public class ArmstrongNum {
//    public static void main(String[] args) {
//        int n,arm = 0,rem ,c;
//        System.out.println("Enter a number");
//        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
//        while(n>0){
//            rem=n%10;
//            arm = (rem*rem*rem)+arm;
//            n=n/10;
//        }
//        if(arm==arm)
//            System.out.println("Armstrong number");
//        else
//            System.out.println("Not an Armstrong number");
//
//    }
//}

package methods;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        int n, arm = 0, rem;
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();          // FIX 1: store input
        int original = n;          // FIX 2: keep original value

        while(n > 0) {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }

        if(original == arm) {      // FIX 3: compare correctly
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}


package Patterns;

public class twenty {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j = 2; j <= i; j++) {
                System.out.print("-");
            }

        for(int k= 5;k >= i ;k--) {
            System.out.print("*");
        }
            System.out.println();
        }
        for (int j = 1; j <= 4; j++) {
            for (int i = 2; i <= j; i++) {
                System.out.print("-");
            }
            for(int k= 5;k >= j ;k--) {
                System.out.print("*");
            }

            System.out.println();
            }
    }
}

package Patterns;

public class seven {
    public static void main(String[] args) {
        int m =4;
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++) {
                if (i == 1 || j == 1 || n == i || m == j) {
                    System.out.print(" *");
                } else {
                    System.out.println(" *");
                }
                System.out.print( " ");
            }
        }
    }
}

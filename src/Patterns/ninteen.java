package Patterns;

public class ninteen {
    public static void main(String[] args) {
        int n=8;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("-");   //for eazy to explain
            }
            for(int k=1; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i=0; i<n; i++){
//            for(int j=0; j< 2*1+i; j++){
//                System.out.print(" *");
//            }
//            for(int k=0; k<n-i-1; k++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
    }
}

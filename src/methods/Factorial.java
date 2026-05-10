package methods;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        // 5.4.3.2.1 = 120
    }
//    Using For()Loop         

    // public static int  factorial(int n) {
    //     int res = 1;
    //     for(int i=1; i<=n; i++){
    //         res = res * i;
    //     }
    //     return res;
        
    // }

//   Using Recursion 
    
    public static int factorial(int n){
        if( n == 1){
            return 1;
        }
        return n*factorial(n-1);

    }
}

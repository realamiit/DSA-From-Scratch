package Patterns;

public class next {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j = 1; j <= 5; j++) {
                System.out.print( i * j);
            }
            System.out.println(" ");
       }
    }
}

//the output is

//        12345
//        246810
//        3691215
//        48121620
//        510152025
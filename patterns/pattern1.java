package patterns;

public class pattern1 {
    public static void main(String[] args) {
//        int n = 5;
//        for (int i=0;i<=n;i++){
//            for (int j=0;j<=i;j++){
//                if (i==0 || i==n-1 || j==0 || j==n-1)
//                    System.out.print("*");
//                    else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        int n =4;
        int m =5;
        for(int i=1;i<=n;i++)
            {
            for(int j=1;j<=m;j++)
            if(i==1 || j==1 || i==n || j==m)
                System.out.print("*");
                else {
                System.out.print(" ");
            }
                System.out.println();
            }
    }
}




//        *****
//        *   *
//        *   *
//        *****
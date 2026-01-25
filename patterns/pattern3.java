package patterns;

public class pattern3 {
    public static void main(String[] args) {
        int n = 9;
        int space =2*n-2;
        for (int i=1;i<=2*n-1;i++){
            int star=i;
            if(i>n) star=2*n-i;
//            star
            for(int j=1;j<=star ;j++){
                System.out.print("*");
            }
//            space
            for(int j=1;j<=space ;j++){
                System.out.print(" ");

            }
//            Star
            for(int j=1;j<=star ;j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<n) space -= 2;
            else space += 2;
        }
    }
}



//        *      *
//        **    **
//        ***  ***
//        ********
//        ***  ***
//        **    **
//        *      *
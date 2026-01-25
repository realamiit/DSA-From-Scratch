package patterns;

public class pattern2 {
    public static void main(String[] args) {
        int iniS=0;
        int n=6;
        for(int i=0;i<n;i++) {
//Star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
//            space
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
//            Star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
//            iniS = 2*n-2;
//            for (int p = 1; p < n; p++) {
////                Star
//                for(int j= 1; j<=p;j++){
//                    System.out.print("*");
//                }
////                space
//                for (int j= 0; j<=iniS; j++){
//                    System.out.print(" ");
//                }
////                Star
//                for(int j=1; j<=p;j++){
//                    System.out.print("*");
//                }
//                iniS -= 2;
//                System.out.println();
//            }
        }

    }

}





//        ************
//        *****  *****
//        ****    ****
//        ***      ***
//        **        **
//        *          *

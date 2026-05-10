//Write a program in Java to print Armstrong number between 1 to 1000
package CollegePractical;

public class ArmstrongNo {
        public static void main(String[] args) {

            System.out.println("Armstrong numbers between 1 and 1000:");

            for (int i = 1; i <= 1000; i++) {
                int num = i;
                int sum = 0;

                while (num != 0) {
                    int digit = num % 10;
                    sum = sum + (digit * digit * digit);
                    num = num / 10;
                }

                if (sum == i) {
                    System.out.println(i);
                }
            }
        }
}


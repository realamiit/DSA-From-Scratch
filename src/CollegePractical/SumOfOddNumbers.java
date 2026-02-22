package CollegePractical;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + 1;
            }
        }
        System.out.println("Sum of odd numbers is " + sum);

//   or

//        for (int i = 1; i <= 100; i += 2) {
//            sum += i;
//        }
//
//        System.out.println("Sum of odd numbers: " + sum);

    }
}

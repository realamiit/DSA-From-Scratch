package CollegePractical;

import java.util.Scanner;

public class LargestSmallestArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);


//        or
//        int arr[] = {10, 25, 3, 45, 8};
//
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) max = arr[i];
//            if (arr[i] < min) min = arr[i];
//        }
//
//        System.out.println("Largest = " + max);
//        System.out.println("Smallest = " + min);


    }
}

package array;

public class DSAArrayQuestion {
//    public static void main(String[] args) {
//        Find the largest element in an array
//
//        int[] arr = {3, 7, 2, 9, 5};
//
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Maximum element: " + max);
//    }
//


//    Reverse the array in-place
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

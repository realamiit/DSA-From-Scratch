package array;

public class LearnArrayExample01 {
    public static void main(String[] args) {

            int[] arr = new int[5]; // size = 5

            // Assign values
            arr[0] = 5;
            arr[1] = 10;
            arr[2] = 15;
            arr[3] = 20;
            arr[4] = 25;

            // Print array
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
}

package DSAMathBasics;

import java.util.Arrays;

public class FindMissNumInArray {
    public static void main(String[] args) {

        int[] arr = {3, 1, 0, 4, 5};

        int n = arr.length;
        int expectedSum = n *(n+1)/2;

        int actualSum = Arrays.stream(arr).sum();

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}

package math.problems;
import java.io.*;
import java.util.*;
public class FindMissingNumber {

    public static void findMissing(int arr[], int N) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */


        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }

public static void main (String args [])
    {
        int arr[] = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = arr.length;
        findMissing(arr, n);
    }
}
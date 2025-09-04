package SDET_Interview_questions.Array;

import java.util.*;

public class Sort012 {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 0, 1, 2, 0, 0, 2, 1, 2};
        System.out.println(Arrays.toString(solve(a)));
    }
    public static int[] solve(int[] arr){
        int c0 = 0, c1 = 0, c2 = 0;
        for (int j : arr) {
            if (j == 0) {
                c0++;
            } else if (j == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        int idx = 0;
        for(int i = 0; i < c0; i++){
            arr[idx++] = 0;
        }
        for(int i = 0; i < c1; i++){
            arr[idx++] = 1;
        }
        for(int i = 0; i < c2; i++){
            arr[idx++] = 2;
        }
        return arr;
    }
}

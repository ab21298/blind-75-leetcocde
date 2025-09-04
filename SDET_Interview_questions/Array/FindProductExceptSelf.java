package SDET_Interview_questions.Array;

import java.util.Arrays;
import java.util.List;

public class FindProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};;
        System.out.println(Arrays.toString(solve(arr)));
    }
    public static int[] solve(int[] arr){
        int[] pref = new int[arr.length];
        int[] sufx = new int[arr.length];
        int[] res = new int[arr.length];
        pref[0] = 1;
        sufx[arr.length - 1] = 1;
        for(int i = 1; i < arr.length; i++){
            pref[i] = arr[i-1] * pref[i-1];
        }
        for(int j = arr.length - 2; j >= 0; j--){
            sufx[j] = arr[j+1] * sufx[j+1];
        }
        for(int i = 0; i < arr.length; i++){
            res[i] = pref[i] * sufx[i];
        }
        return res;
    }
}

package SDET_Interview_questions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2,3,1,1,3,1};
        Arrays.sort(arr);
        System.out.println(solve(arr));
    }
    public static List<Integer> solve(int[] arr){
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}

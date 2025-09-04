package SDET_Interview_questions.Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,6,5,-1,0,4};
        System.out.println(Arrays.toString(solve(arr, 10)));
    }
    public static int[] solve(int[] arr, int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(target - arr[i])){
                return new int[]{hashMap.get(target-arr[i]),i};
            }else{
                hashMap.put(arr[i],i);
            }
        }
        return new int[]{};
    }
}

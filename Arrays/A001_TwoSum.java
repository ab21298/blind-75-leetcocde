package Arrays;

import java.util.Arrays;
import java.util.HashMap;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 */

public class A001_TwoSum {
    public static void main(String[] args) {
        int []arr = {2,7,11,15};
        int target = 13;
        int [] solutionArray = Solution(arr, target);
        System.out.println(Arrays.toString(solutionArray));
    }

    private static int[] Solution(int []arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0 ; i < arr.length; i++){
            if(hashMap.containsKey(target - arr[i])){
                return new int[]{hashMap.get(target - arr[i]),i};
            }else{
                hashMap.put(arr[i],i);
            }
        }
        return new int[]{};
    }
}

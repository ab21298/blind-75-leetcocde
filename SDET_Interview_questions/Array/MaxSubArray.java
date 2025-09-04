package SDET_Interview_questions.Array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        int res = arr[0];
        int maxEnd = arr[0];
        for(int i=1;i< arr.length;i++){
            maxEnd = Math.max(maxEnd+arr[i], arr[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }
}

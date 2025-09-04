package SDET_Interview_questions.Array;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,6,-3,-10,0,2};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        int currMin = arr[0];
        int currMax = arr[0];
        int maxProd = arr[0];
        for(int i=1;i< arr.length;i++){
            int temp = max(arr[i], arr[i]*currMax, arr[i]*currMin);
            currMin = min(arr[i], arr[i]*currMax, arr[i]*currMin);
            currMax = temp;
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
    public static int max(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}

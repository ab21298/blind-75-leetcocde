package SDET_Interview_questions.Array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println("Third largest element: " + solve(arr));
    }
    public static int solve(int[] arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int n: arr){
            if(n > first){
                third = second;
                second = first;
                first = n;
            }else if(n > second){
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }
        return third;
    }
}

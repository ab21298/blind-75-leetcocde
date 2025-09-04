package SDET_Interview_questions.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println("duplicate element: " + solve(arr));
    }
    public static List<Integer> solve(int[] arr){
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int n: arr){
            if(hashSet.contains(n)) ans.add(n);
            else hashSet.add(n);
        }
        return ans;
    }
}

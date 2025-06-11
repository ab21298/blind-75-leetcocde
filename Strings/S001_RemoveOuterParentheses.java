package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S001_RemoveOuterParentheses {
    public String removeOuterParentheses(String s){
        int sum = 0;
        List<String> strings = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));
            if(s.charAt(i) == '('){
                sum++;
            }else {
                sum--;
            }
            if(sum == 0){
                strings.add(String.valueOf(str));
                str.setLength(0);
            }
        }
        System.out.println(strings);
        // Remove outer parentheses of each primitive and join them
        StringBuilder result = new StringBuilder();
        for (String temp : strings) {
            result.append(temp, 1, temp.length() - 1); // Remove first and last char
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(new S001_RemoveOuterParentheses().removeOuterParentheses(str));
    }
}

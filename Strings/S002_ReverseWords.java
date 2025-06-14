package Strings;

import java.util.List;

public class S002_ReverseWords {
    public String reverseWords(String s) {
        List<String> str = List.of(s.split(" +"));
        StringBuilder result = new StringBuilder();
        for(int i = str.size()-1; i >= 0; i--){
            result.append(str.get(i));
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = " a good   example";
        System.out.println(new S002_ReverseWords().reverseWords(str));
    }
}

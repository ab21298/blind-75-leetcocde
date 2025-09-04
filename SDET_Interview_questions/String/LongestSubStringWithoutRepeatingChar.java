package SDET_Interview_questions.String;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        if(str.isEmpty() || str.length() == 1) return str.length();
        int maxLength = 0;
        int start = 0;
        for(int end=0;end<str.length();end++){
            char currentChar = str.charAt(end);
            if(map.containsKey(currentChar) && map.get(currentChar) >= start){
                start = map.get(currentChar) + 1;
            }
            map.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}

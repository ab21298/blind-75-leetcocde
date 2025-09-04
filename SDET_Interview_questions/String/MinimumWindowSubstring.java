package SDET_Interview_questions.String;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(solve(s, t)); // Output: "BANC"
    }
    public static String minWindow(String s, String p){
        int len1 = s.length();
        int len2 = p.length();

        if (len1 < len2)
            return "-1";

        int[] countP = new int[256];
        int[] countS = new int[256];

        // Store occurrence of characters of P
        for (int i = 0; i < len2; i++)
            countP[p.charAt(i)]++;

        int start = 0, start_idx = -1, min_len = Integer.MAX_VALUE;
        int count = 0;
        for (int j = 0; j < len1; j++) {
            char currChar = s.charAt(j);
            countS[currChar]++;
            if (countP[currChar] > 0 && countS[currChar] <= countP[currChar]) {
                count++;
            }
            // If all characters are matched
            if (count == len2) {
                // Try to minimize the window
                char startChar;
                while (countS[startChar = s.charAt(start)] > countP[startChar] || countP[startChar] == 0) {
                    if (countS[startChar] > countP[startChar]) {
                        countS[startChar]--;
                    }
                    start++;
                }
                // Update window size
                int len = j - start + 1;
                if (min_len > len) {
                    min_len = len;
                    start_idx = start;
                }

            }
        }
        if (start_idx == -1)
            return "";
        return s.substring(start_idx, start_idx + min_len);
    }

    public static String solve(String s, String t){
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(char ch: t.toCharArray()){
            tmap.put(ch, tmap.getOrDefault(ch,0)+1);
        }
        int start = 0, windowStart = 0, windowEnd = 0, minLen = Integer.MAX_VALUE;
        int matched = 0;
        for(windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char currentChar = s.charAt(windowEnd);
            if(tmap.containsKey(currentChar)){
                tmap.put(currentChar, tmap.get(currentChar) - 1);
                if(tmap.get(currentChar)>=0){
                    matched++;
                }
            }
            while (matched == t.length()){
                if(minLen > windowEnd - windowStart + 1){
                    minLen = windowEnd - windowStart + 1;
                    start = windowStart;
                }

                char leftChar = s.charAt(windowStart++);
                if(tmap.containsKey(leftChar)){
                    if(tmap.get(leftChar)==0){
                        matched--;
                    }
                    tmap.put(leftChar, tmap.get(leftChar)+1);
                }
            }
        }
        if(minLen > s.length()) return "";
        return s.substring(start, start + minLen);
    }
}

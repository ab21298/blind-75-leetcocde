package SDET_Interview_questions.String;

import java.util.Arrays;

public class LongestPalindromeWithDP {
    private static int[][] t;

    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindromicSubstring(str)); // bab or aba
    }

    public static String longestPalindromicSubstring(String str) {
        int start_point = 0;
        int max_length = 0;
        int n = str.length();

        t = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(t[i], -1); // mark all as "not computed"
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(str, i, j)) {
                    if (j - i + 1 > max_length) {
                        max_length = j - i + 1;
                        start_point = i;
                    }
                }
            }
        }

        return str.substring(start_point, start_point + max_length); // fixed end index
    }

    public static boolean isPalindrome(String str, int i, int j) {
        if (i >= j) return true;

        if (t[i][j] != -1) {
            return t[i][j] == 1;
        }

        if (str.charAt(i) == str.charAt(j)) {
            t[i][j] = isPalindrome(str, i + 1, j - 1) ? 1 : 0;
        } else {
            t[i][j] = 0;
        }

        return t[i][j] == 1;
    }
}

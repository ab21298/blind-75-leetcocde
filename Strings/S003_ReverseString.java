package Strings;

public class S003_ReverseString {
        // Java program to reverse a string using two pointers
        static String reverseString(String s) {
            int left = 0, right = s.length() - 1;
            StringBuilder result = new StringBuilder(s);
            while(left<right){
                result.setCharAt(left, s.charAt(right));
                result.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
            return result.toString();
        }

        public static void main(String[] args) {
            String s = "abdcfe";
            System.out.println(reverseString(s));
        }
}

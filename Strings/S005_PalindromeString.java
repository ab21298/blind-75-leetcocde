package Strings;

public class S005_PalindromeString {
    public static void main(String[] args) {
        String str = "abbaa";
        System.out.println("String is palindrome : " + solution(str));
    }
    public static Boolean solution(String str){
        String reverseString = String.valueOf(new StringBuilder(str).reverse());
        return str.equals(reverseString);
    }
}

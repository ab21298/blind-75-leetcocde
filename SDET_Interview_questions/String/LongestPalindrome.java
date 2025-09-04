package SDET_Interview_questions.String;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindromicSubstring(str));
    }
    public static String longestPalindromicSubstring(String str){
        int start_point = 0;
        int max_length = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isPalindrome(str, i, j)){
                    if(j-i+1 > max_length){
                        max_length = j-i+1;
                        start_point = i;
                    }
                }
            }
        }
        return str.substring(start_point, max_length);
    }
    public static boolean isPalindrome(String str, int i, int j){
        if(i>=j) return true;
        if(str.charAt(i) == str.charAt(j)){
            return isPalindrome(str, i+1, j-1);
        }else{
            return false;
        }
    }
}

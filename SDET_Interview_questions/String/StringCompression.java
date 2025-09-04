package SDET_Interview_questions.String;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabcccccaaad";
        System.out.println(solve(str));
    }
    public static String solve(String str){
        char ch = str.charAt(0);
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }else{
                ans.append(ch);
                ans.append(count);
                count = 1;
                ch = str.charAt(i);
            }
        }
        ans.append(ch);
        ans.append(count);
        return ans.toString();
    }
}

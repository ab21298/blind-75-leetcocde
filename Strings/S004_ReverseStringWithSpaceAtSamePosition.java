package Strings;

public class S004_ReverseStringWithSpaceAtSamePosition {
    public static String solution(String s){
        int count = 0;
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') continue;
            if(s.charAt(count)==' ') {
                result.append(s.charAt(count));
                count++;
            }
            result.append(s.charAt(i));
            count++;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "My name is Abhishek Yadav";
        System.out.println(solution(s));
    }
}

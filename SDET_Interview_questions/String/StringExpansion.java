package SDET_Interview_questions.String;

public class StringExpansion {
    public static void main(String[] args) {
        String str = "a3b2c1d4e1";
        System.out.println(convertNumToChar(str));//output aaabbcdddde
    }
    public static String convertNumToChar(String str){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                ans.append(str.charAt(i));
            }else{
                int a = Character.getNumericValue(str.charAt(i));
                for(int j=0;j<a-1;j++){
                    ans.append(str.charAt(i-1));
                }
            }
        }
        return ans.toString();
    }
}

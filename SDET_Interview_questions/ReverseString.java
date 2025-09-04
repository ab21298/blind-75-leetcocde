package SDET_Interview_questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "My Name is Abhishek Yadav";
        System.out.println(reverseString(str));
    }

    public static StringBuilder reverseString(String str){
        StringBuilder outputString = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            outputString.append(str.charAt(i));
        }
        return outputString;
    }
}

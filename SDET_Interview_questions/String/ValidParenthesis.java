package SDET_Interview_questions.String;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){ //opening
                st.push(str.charAt(i));
            }else{ //closing
                if(st.isEmpty()) return false;

                if(st.peek() == '(' && str.charAt(i) == ')' ||
                        st.peek() == '{' && str.charAt(i) == '}' ||
                        st.peek() == '[' && str.charAt(i) == ']'){
                    st.pop();
                }else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

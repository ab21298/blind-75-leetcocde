package Strings;

import java.util.HashMap;

public class S006_DuplicateCharInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicates(s);
    }
    public static void printDuplicates(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: s.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        for (HashMap.Entry<Character, Integer> it: hashMap.entrySet()){
            if(it.getValue()>1) System.out.print("['"+it.getKey()+"',"+it.getValue()+"], ");
        }
    }
}

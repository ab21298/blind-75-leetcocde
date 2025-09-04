package SDET_Interview_questions;

public class SumOfDigit {
    public static void main(String[] args) {
        int number = 45762;
        System.out.println(sumOfDigit(number));
    }
    public static int sumOfDigit(int number){
        if(number/10 == 0){
            return number;
        }
        return sumOfDigit(number/10) + number%10;
    }
}

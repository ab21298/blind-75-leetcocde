package SDET_Interview_questions;

public class CheckPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }

    public static boolean isPrime(int number){
        if (number<=1) return false;
        else{
            for(int i = 2; i < number/2; i++){
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

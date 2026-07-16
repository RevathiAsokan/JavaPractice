package DSAProblemSolving;

public class Challenge1ProductOfDigits {

    public static void main(String[] args){
        int[] nums = {100,26,1000,729,252,19};
        System.out.println("Count of numbers which can have a integer such that product of the digits is equal to number "  + countOfNumbers(nums));
    }

    public static int countOfNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(productOfDigits(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean productOfDigits(int num){
        int[] div = {9,8,7,6,5,4,3,2};
        for(int d : div){
            while(num % d == 0) {
                num = num / d;
            }
        }
        return num <= 1;
    }
}

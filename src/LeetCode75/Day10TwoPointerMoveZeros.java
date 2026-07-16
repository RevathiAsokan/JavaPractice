package LeetCode75;

import java.util.Arrays;

public class Day10TwoPointerMoveZeros {

    public static void main(String[] args){
        //int[] nums = {0,1,0,3,12};
        int[] nums = {0};
        System.out.println("Moved zeros : " + Arrays.toString(moveZeros(nums)));
    }

    public static int[] moveZeros(int[] nums){
        int lastNonZeroFound = 0;
        for(int num : nums){
            if(num != 0){
                nums[lastNonZeroFound++] = num;
            }
        }
        while(lastNonZeroFound < nums.length){
            nums[lastNonZeroFound++] = 0;
        }
        return nums;
    }
}

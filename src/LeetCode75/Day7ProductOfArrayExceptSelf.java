package LeetCode75;

import java.util.Arrays;

public class Day7ProductOfArrayExceptSelf {

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4};
        //int[] nums = {-1, 1, 0, -3, 3};
        System.out.println("Product of array except self : " + Arrays.toString(productOfArrayExceptSelf(nums)));

    }

    public static int[] productOfArrayExceptSelf(int[] nums){
        int[] productOfArray = new int[nums.length];

        //product of prefix
        productOfArray[0] = 1; //first element will not have any previous elements hence 1
        for(int i = 1; i < nums.length; i++){
           productOfArray[i] = productOfArray[i-1] * nums[i-1]; //product of previous number * previous number
        }

        //product of suffix
        int suffix = 1;
        for(int i = nums.length-1; i >= 0; i--){
            productOfArray[i] = productOfArray[i] * suffix;
            suffix = suffix * nums[i];
        }
        return productOfArray;
    }
}

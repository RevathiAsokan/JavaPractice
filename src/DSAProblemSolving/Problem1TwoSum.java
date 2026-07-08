package DSAProblemSolving;

//Problem Statement: 2 Sum
//
//Given an array of size N and an integer target, find the indices (i, j) of two numbers such that their sum is equal to the target.
//Constraint: i != j
//You can assume that there will be exactly one solution.
//Sample Input
//N = 5
//arr = {7, 6, 3, 8, 2}
//target = 14
//Sample Output
//1 3

import java.util.Arrays;

public class Problem1TwoSum {

    public static void main(String[] args){

        int[] arr = {7, 6, 3, 8, 2};
        int target = 14;

        System.out.println("Two sum indices : " + twoSum(arr, target));
    }

    public static String twoSum(int[] arr, int target){
        int[] indices = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }

        return Arrays.toString(indices);
    }
}

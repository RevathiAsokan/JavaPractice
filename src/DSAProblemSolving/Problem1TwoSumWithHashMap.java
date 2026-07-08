package DSAProblemSolving;
import java.util.HashMap;

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

//Logic of 2 Sum using HashMap:
//Iterate through the array, and for each element check if its complement (target - arr[i]) already exists in the HashMap;
// if yes, return the pair of indices, otherwise store the current element with its index in the HashMap.

public class Problem1TwoSumWithHashMap {

    public static void main(String[] args){

//        int[] arr = {11, 3, 7, 9, 14, 2};
//        int target = 17;

        int[] arr = {7, 6, 3, 8, 2};
        int target = 14;
        HashMap<Integer, Integer> arrMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            System.out.println("target " + target + " arr[i] " + arr[i]);
            if(arrMap.containsKey(target - arr[i])){
                System.out.println("found at index : " + i);
                System.out.println("Indices : " + arrMap.get(target - arr[i]) + ", " + i);
                break;
            } else {
                System.out.println("Added to hashmap number" + arr[i] + " at index " + i);
                arrMap.put(arr[i], i);
            }
        }
    }
}

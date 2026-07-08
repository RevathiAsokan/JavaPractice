package DSAProblemSolving;

//Given an array and a target. You need to find all the triplets (a[i], a[j], a[k]) such that
//a[i] + a[j] + a[k] = target and i != j != k.
//Note: The solution must contain unique triplets.
//Sample Input
//N = 7
//arr = {7, -6, 3, 8, -1, 8, -11}
//target = 0
//Sample Output
//[-11, 3, 8], [-6, -1, 7]


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2ThreeSum {

    public static void main(String[] args){                              //Time complexity = O(n2)     //Space complexity = O(1)

        int[] a = {7, -6, 3, 8, -1, 8, -11};
        int target = 0;

        System.out.println("Three Sum : " + threeSum(a, target));

    }

    public static String threeSum(int[] a, int target){
        Arrays.sort(a);                                                     // TC: nlogn

        List<int[]> threeSum = new ArrayList<>();

        for(int i = 0 ; i < a.length; i++){                                // TC: n
            //duplicate check for i
            if(i == 0 || a[i] != a[i-1]){

                int j = i+1, k = a.length-1;
                int tar = target - a[i];

                while(j < k){    //two pointer                            //TC: n
                    if(a[j] + a[k] == tar){
                        threeSum.add(new int[]{a[i],a[j],a[k]});
                        //ignoring duplicates
                        while(a[j] == a[j+1]) j++;
                        while (a[k] == a[k-1]) k--;

                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar){ //lesser increment j
                        j++;
                    } else { //greater decrement k
                        k--;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int[] triplets : threeSum){
            sb.append(Arrays.toString(triplets)).append(" ");
        }

        return sb.toString().trim();
    }
}

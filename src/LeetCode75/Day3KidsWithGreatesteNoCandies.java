package LeetCode75;

//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the i-th kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if, after giving the i-th kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//        Note: Multiple kids can have the greatest number of candies.
//        Example 1
//        • Input: candies = [2,3,5,1,3], extraCandies = 3
//        • Output: [true,true,true,false,true]
//        • Explanation:
//        ○ Kid 1 → 2 + 3 = 5 (greatest)
//        ○ Kid 2 → 3 + 3 = 6 (greatest)
//        ○ Kid 3 → 5 + 3 = 8 (greatest)
//        ○ Kid 4 → 1 + 3 = 4 (not greatest)
//33333333Kid 5 → 3 + 3 = 6 (greatest)

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Day3KidsWithGreatesteNoCandies {

    public static void main(String[] args){

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println("Kids with greatest no. of candies: " + greatestNoCandies(candies, extraCandies));

        System.out.println("Kids with greatest no. of candies: " + greatestNoCandiesUsingStreams(candies, extraCandies));
    }

    public static List<Boolean> greatestNoCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();

        int max = candies[0];
        for(int candy : candies){
            if(candy > max) max = candy;
        }

        for(int candy : candies){
            if(candy + extraCandies >= max){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;

    }

    public static List<Boolean> greatestNoCandiesUsingStreams(int[] candies, int extraCandies){

        int maxCandies = Arrays.stream(candies).max().getAsInt();

        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= maxCandies).collect(Collectors.toList());

    }


}

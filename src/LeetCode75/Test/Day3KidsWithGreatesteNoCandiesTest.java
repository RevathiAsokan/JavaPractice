package LeetCode75.Test;

import LeetCode75.Day2GCDOfStrings;
import LeetCode75.Day3KidsWithGreatesteNoCandies;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Day3KidsWithGreatesteNoCandiesTest {

    @Test
    public void testCase1(){
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expectedResult = Arrays.asList(true, true, true, false,true);

        List<Boolean> greatestNoCandies = Day3KidsWithGreatesteNoCandies.greatestNoCandies(candies, extraCandies);
        assertEquals(expectedResult, greatestNoCandies);
    }

    @Test
    public void testCase2ForStreams(){
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expectedResult = Arrays.asList(true, false, false, false,false);

        List<Boolean> greatestNoCandies = Day3KidsWithGreatesteNoCandies.greatestNoCandiesUsingStreams(candies, extraCandies);
        assertEquals(expectedResult, greatestNoCandies);
    }

    //LeetCodePractice tests
//    @Test
//    public void testCase2ForLeetPractice(){
//        int[] candies = {4, 2, 1, 1, 2};
//        int extraCandies = 1;
//        List<Boolean> expectedResult = Arrays.asList(true, false, false, false,false);
//
//        List<Boolean> greatestNoCandies = LeetCodePractice.greatestNoCandies(candies, extraCandies);
//        assertEquals(expectedResult, greatestNoCandies);
//    }
//
//    @Test
//    public void testCase2ForLeetPracticeStream(){
//        int[] candies = {2, 3, 5, 1, 3};
//        int extraCandies = 3;
//        List<Boolean> expectedResult = Arrays.asList(true, true, true, false,true);
//
//        List<Boolean> greatestNoCandies = LeetCodePractice.greatestNoCandiesUsingStream(candies, extraCandies);
//        assertEquals(expectedResult, greatestNoCandies);
//    }



}
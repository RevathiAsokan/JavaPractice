package LeetCode75.Test;

import DSAProblemSolving.DSAPractice;
import LeetCode75.Day7ProductOfArrayExceptSelf;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day7ProductOfArrayExceptSelfTest {

    @Test
    public void TestCase1(){
        int[] nums = {1, 2, 3, 4};
        int[] output = {24, 12, 8, 6};
        int[] resultArray = Day7ProductOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        assertArrayEquals(output, resultArray);
    }

    @Test
    public void TestCase2(){
        int[] nums = {-1, 1, 0, -3, 3};
        int[] output = {0,0,9,0,0};
        int[] resultArray = Day7ProductOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        assertArrayEquals(output, resultArray);
    }

//    @Test
//    public void TestCase1LeetCodePractice(){
//        int[] nums = {1, 2, 3, 4};
//        int[] output = {24, 12, 8, 6};
//        int[] resultArray = LeetCodePractice.productOfArrayExceptSelf(nums);
//        assertArrayEquals(output, resultArray);
//    }
//
//    @Test
//    public void TestCase2LeetCodePractice(){
//        int[] nums = {-1, 1, 0, -3, 3};
//        int[] output = {0,0,9,0,0};
//        int[] resultArray = LeetCodePractice.productOfArrayExceptSelf(nums);
//        assertArrayEquals(output, resultArray);
//    }

}
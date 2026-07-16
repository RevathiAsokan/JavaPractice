package LeetCode75.Test;

import LeetCode75.Day10TwoPointerMoveZeros;
import LeetCode75.LeetCodePractice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day10TwoPointerMoveZerosTest {

    @Test
    public void TestCase1(){
        int[] nums = {0};
        int[] res = {0};

        int[] result = Day10TwoPointerMoveZeros.moveZeros(nums);
        assertArrayEquals(res, result);

    }

    @Test
    public void TestCase2(){
        int[] nums = {0,1,0,3,12};
        int[] res = {1, 3, 12, 0, 0};

        int[] result = Day10TwoPointerMoveZeros.moveZeros(nums);
        assertArrayEquals(res, result);
    }

//    @Test
//    public void TestCase1LeetCode(){
//        int[] nums = {0};
//        int[] res = {0};
//
//        int[] result = LeetCodePractice.moveZeros(nums);
//        assertArrayEquals(res, result);
//
//    }
//
//    @Test
//    public void TestCase2LeetCode(){
//        int[] nums = {0,1,0,3,12};
//        int[] res = {1, 3, 12, 0, 0};
//
//        int[] result = LeetCodePractice.moveZeros(nums);
//        assertArrayEquals(res, result);
//    }


}
package LeetCode75.Test;

import LeetCode75.Day8IncreasingTripletSubSeq;
import LeetCode75.LeetCodePractice;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Day8IncreasingTripletSubSeqTest {

    @Test
    @Order(1)
    public void TestCase1(){
        int[] nums = {2,1,5,0,4,6};
        boolean res = true;
        boolean result = Day8IncreasingTripletSubSeq.incTripletSubSeqExist(nums);
        assertEquals(res, result);
    }

    @Test
    @Order(2)
    public void TestCase2(){
        int[] nums = {1, 2, 3, 4, 5};
        boolean res = true;
        boolean result = Day8IncreasingTripletSubSeq.incTripletSubSeqExist(nums);
        assertEquals(res, result);
    }

    @Test
    @Order(3)
    public void TestCase3(){
        int[] nums = {5, 4, 3, 2, 1};
        boolean res = false;
        boolean result = Day8IncreasingTripletSubSeq.incTripletSubSeqExist(nums);
        assertEquals(res, result);
    }

//    @Test
//    @Order(4)
//    public void TestCase1LeetCodePractice(){
//        int[] nums = {2,1,5,0,4,6};
//        boolean res = true;
//        boolean result = LeetCodePractice.incTripletSubSeqExist(nums);
//        assertEquals(res, result);
//    }
//
//    @Test
//    @Order(5)
//    public void TestCase2LeetCodePractice(){
//        int[] nums = {1, 2, 3, 4, 5};
//        boolean res = true;
//        boolean result = LeetCodePractice.incTripletSubSeqExist(nums);
//        assertEquals(res, result);
//    }
//
//    @Test
//    @Order(6)
//    public void TestCase3LeetCodePractice(){
//        int[] nums = {5, 4, 3, 2, 1};
//        boolean res = false;
//        boolean result = LeetCodePractice.incTripletSubSeqExist(nums);
//        assertEquals(res, result);
//    }

}
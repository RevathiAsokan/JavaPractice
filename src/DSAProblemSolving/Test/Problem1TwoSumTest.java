package DSAProblemSolving.Test;

import DSAProblemSolving.DSAPractice;
import DSAProblemSolving.Problem1TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1TwoSumTest {

    @Test
    public void testCase1(){
        String indices = Problem1TwoSum.twoSum(new int[]{7, 6, 3, 8, 2}, 14);
        assertEquals("[1, 3]", indices);
    }

    //For DSAPractice
//    @Test
//    public void testCase1ForPractice(){
//        String indices = DSAPractice.twoSum(new int[]{7, 6, 3, 8, 2}, 14);
//        assertEquals("[1, 3]", indices);
//    }
//    @Test
//    public void testCase2ForPractice(){
//        String indices = DSAPractice.twoSum(new int[]{5, 6, 3, 8, 2}, 9);
//        assertEquals("[1, 2]", indices);
//    }
}
package DSAProblemSolving.Test;

import DSAProblemSolving.DSAPractice;
import DSAProblemSolving.Problem4MajorityElement;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem4MajorityElementTest {
    @Test
    public void testCase1(){
        int[] elements = {2, 2, 6, 6, 6, 2, 2, 8, 2, 2};
        int result = 2;
        int majorityElement = Problem4MajorityElement.majorityElement(elements);
        assertEquals(result, majorityElement);
    }

    @Test
    public void testCase2(){
        int[] elements = {4, 4, 3, 4, 7, 3, 4, 4, 7, 4, 4, 7, 4, 4};
        int result = 4;
        int majorityElement = Problem4MajorityElement.majorityElement(elements);
        assertEquals(result, majorityElement);
    }

//    @Test
//    public void testCase1DSAPractice(){
//        int[] elements = {2, 2, 6, 6, 6, 2, 2, 8, 2, 2};
//        int result = 2;
//        int majorityElement = DSAPractice.majorityElement(elements);
//        assertEquals(result, majorityElement);
//    }
//
//    @Test
//    public void testCase2DSAPractice(){
//        int[] elements = {4, 4, 3, 4, 7, 3, 4, 4, 7, 4, 4, 7, 4, 4};
//        int result = 4;
//        int majorityElement = DSAPractice.majorityElement(elements);
//        assertEquals(result, majorityElement);
//    }
}
package DSAProblemSolving.Test;

import DSAProblemSolving.DSAPractice;
import DSAProblemSolving.Problem2ThreeSum;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem2ThreeSumTest {

    @Test
    public void testCase1(){
        int[] arr = {7, -6, 3, 8, -1, 8, -11};
        int target = 0;
        String result = "[-11, 3, 8] [-6, -1, 7]";

        String threeSum = Problem2ThreeSum.threeSum(arr, target);
        assertEquals(result, threeSum);
    }

//    @Test
//    public void testCase1DSAPractice(){
//        int[] arr = {7, -6, 3, 8, -1, 8, -11};
//        int target = 0;
//        String result = "[-11, 3, 8] [-6, -1, 7]";
//
//        String threeSum = DSAPractice.threeSum(arr, target);
//        assertEquals(result, threeSum);
//    }

}
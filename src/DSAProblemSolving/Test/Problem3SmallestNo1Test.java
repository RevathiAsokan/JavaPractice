package DSAProblemSolving.Test;

import DSAProblemSolving.DSAPractice;
import DSAProblemSolving.Problem3SmallestNo1;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem3SmallestNo1Test {

    @Test
    public void testCase1(){
        String result = Problem3SmallestNo1.smallestNo1(1000);
        assertEquals("5558", result);
    }

    @Test
    public void testCase2(){
        String result = Problem3SmallestNo1.smallestNo1(81000);
        assertEquals("555899", result);
    }

//    @Test
//    public void testCase1ForDSAPractice(){
//        String result = DSAPractice.smallestNo1(1000);
//        assertEquals("5558", result);
//    }
//
//    @Test
//    public void testCase2ForDSAPractice(){
//        String result = DSAPractice.smallestNo1(81000);
//        assertEquals("555899", result);
//    }

}
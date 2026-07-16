package DSAProblemSolving.Test;

import DSAProblemSolving.Challenge1ProductOfDigits;
import DSAProblemSolving.DSAPractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Challenge1ProductOfDigitsTest {

    @Test
    public void TestCase1(){

        int[] nums = {100,26,1000,729,252,19};
        int res = 4;
        int result = Challenge1ProductOfDigits.countOfNumbers(nums);
        assertEquals(res, result);
    }

//    @Test
//    public void TestCase1DSAPractice(){
//
//        int[] nums = {100,26,1000,729,252,19};
//        int res = 4;
//        int result = DSAPractice.countOfNumbers(nums);
//        assertEquals(res, result);
//    }
}
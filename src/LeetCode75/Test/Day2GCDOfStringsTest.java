package LeetCode75.Test;

import LeetCode75.Day2GCDOfStrings;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day2GCDOfStringsTest {

    @Test
    public void testCase1(){
        String gcdOfStrings = Day2GCDOfStrings.gcdOfStrings("ABCABC","ABC");
        assertEquals("ABC", gcdOfStrings);
    }

    @Test
    public void testCase2(){
        String gcdOfStrings = Day2GCDOfStrings.gcdOfStrings("ABABAB","ABAB");
        assertEquals("AB", gcdOfStrings);
    }

    @Test
    public void testCase3(){
        String gcdOfStrings = Day2GCDOfStrings.gcdOfStrings("LEET","CODE");
        assertEquals("", gcdOfStrings);
    }


    // LeetCodePractice Test
//    @Test
//    public void testCase1LeetCode(){
//        String gcdOfStrings = LeetCodePractice.gcdOfStrings("ABCABC","ABC");
//        assertEquals("ABC", gcdOfStrings);
//    }
//
//    @Test
//    public void testCase2LeetCode(){
//        String gcdOfStrings = LeetCodePractice.gcdOfStrings("ABABAB","ABAB");
//        assertEquals("AB", gcdOfStrings);
//    }
//
//    @Test
//    public void testCase3LeetCode(){
//        String gcdOfStrings = LeetCodePractice.gcdOfStrings("LEET","CODE");
//        assertEquals("", gcdOfStrings);
//    }
}
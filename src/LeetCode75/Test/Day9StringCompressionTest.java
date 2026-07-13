package LeetCode75.Test;

import LeetCode75.Day9StringCompression;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day9StringCompressionTest {

    @Test
    public void TestCase1(){
        char[] charArray ={'a'};
        int res = 1;
        int result = Day9StringCompression.stringCompression(charArray);
        assertEquals(res, result);
    }

    @Test
    public void TestCase2(){
        char[] charArray ={'a','a','b','b','c','c'};
        int res = 6;
        int result = Day9StringCompression.stringCompression(charArray);
        assertEquals(res, result);
    }

    @Test
    public void TestCase3(){
        char[] charArray ={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int res = 4;
        int result = Day9StringCompression.stringCompression(charArray);
        assertEquals(res, result);
    }

//    @Test
//    public void TestCase1LeetCodePractice(){
//        char[] charArray ={'a'};
//        int res = 1;
//        int result = LeetCodePractice.stringCompression(charArray);
//        assertEquals(res, result);
//    }
//
//    @Test
//    public void TestCase2LeetCodePractice(){
//        char[] charArray ={'a','a','b','b','c','c'};
//        int res = 6;
//        int result = LeetCodePractice.stringCompression(charArray);
//        assertEquals(res, result);
//    }
//
//    @Test
//    public void TestCase3LeetCodePractice(){
//        char[] charArray ={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//        int res = 4;
//        int result = LeetCodePractice.stringCompression(charArray);
//        assertEquals(res, result);
//    }

}
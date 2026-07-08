package LeetCode75.Test;
import LeetCode75.Day1MergeStringsAlternatively1;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day1MergeStringsAlternatively1Test {

    @Test
    public void testCase1(){
        String mergedString = Day1MergeStringsAlternatively1.mergedString("abc", "pqr");
        assertEquals("apbqcr", mergedString);
    }

    @Test
    public void testCase2(){
        String mergedString = Day1MergeStringsAlternatively1.mergedString("abcd", "pq");
        assertEquals("apbqcd", mergedString);
    }

//    @Test
//    public void testCase1ForLeetCodePractice(){
//        String mergedString = LeetCodePractice.mergedString("abc", "pqr");
//        assertEquals("apbqcr", mergedString);
//    }
//
//    @Test
//    public void testCase2ForLeetCodePractice(){
//        String mergedString = LeetCodePractice.mergedString("abcd", "pq");
//        assertEquals("apbqcd", mergedString);
//    }




//    @org.junit.jupiter.api.Test
//    public void testMergedStringEqualLength() {
//        String result = DSAPractice.mergedString("abc", "xyz");
//        assertEquals("axbycz", result);
//    }
//
//    @org.junit.jupiter.api.Test
//    public void testMergedStringWord1Longer() {
//        String result = DSAPractice.mergedString("abcd", "pq");
//        assertEquals("apbqcd", result);
//    }
//
//    @org.junit.jupiter.api.Test
//    public void testMergedStringWord2Longer() {
//        String result = DSAPractice.mergedString("hi", "world");
//        assertEquals("hwiorld", result);
//    }
//
//    @org.junit.jupiter.api.Test
//    public void testMergedStringEmptyWord1() {
//        String result = DSAPractice.mergedString("", "pqrs");
//        assertEquals("pqrs", result);
//    }
//
//    @org.junit.jupiter.api.Test
//    public void testMergedStringEmptyWord2() {
//        String result = DSAPractice.mergedString("abc", "");
//        assertEquals("abc", result);
//    }
//
//    @org.junit.jupiter.api.Test
//    public void testMergedStringWord1Longer1(){
//        String result = DSAPractice.mergedString("abc d", "hello");
//        assertEquals("ahbecl ldo", result);
//    }

}
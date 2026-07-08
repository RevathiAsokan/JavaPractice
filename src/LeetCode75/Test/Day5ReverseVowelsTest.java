package LeetCode75.Test;

import LeetCode75.Day5ReverseVowels;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day5ReverseVowelsTest {

    @Test
    public void TestCase1(){
        //String word = "IceCreAm";
        String word = "leetcode";
        String reverseVowel = "leotcede";

        String result = Day5ReverseVowels.reverseVowels(word);
        assertEquals(reverseVowel, result);
    }

    @Test
    public void TestCase2(){
        String word = "IceCreAm";
        String reverseVowel = "AceCreIm";

        String result = Day5ReverseVowels.reverseVowels(word);
        assertEquals(reverseVowel, result);
    }

//    @Test
//    public void TestCase1Leetcode(){
//        //String word = "IceCreAm";
//        String word = "leetcode";
//        String reverseVowel = "leotcede";
//
//        String result = LeetCodePractice.reverseVowels(word);
//        assertEquals(reverseVowel, result);
//    }
//
//    @Test
//    public void TestCase2Leetcode(){
//        String word = "IceCreAm";
//        String reverseVowel = "AceCreIm";
//
//        String result = LeetCodePractice.reverseVowels(word);
//        assertEquals(reverseVowel, result);
//    }





}
package LeetCode75.Test;

import LeetCode75.Day6ReverseWords;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day6ReverseWordsTest {

    @Test
    public void TestCase1(){
        //String str = "the sky is blue";
        //String str = "  hello world  ";
        String str = "a good     example";
        String reversedWords = "example good a";

        String result = Day6ReverseWords.reverseWords(str);
        assertEquals(reversedWords, result);
    }

    @Test
    public void TestCase2(){
        String str = "the sky is blue";
        String reversedWords = "blue is sky the";

        String result = Day6ReverseWords.reverseWords(str);
        assertEquals(reversedWords, result);
    }

    @Test
    public void TestCase3(){
        String str = "  hello world  ";
        String reversedWords = "world hello";

        String result = Day6ReverseWords.reverseWords(str);
        assertEquals(reversedWords, result);
    }

//    @Test
//    public void TestCase1LeetCodePractice(){
//        //String str = "the sky is blue";
//        //String str = "  hello world  ";
//        String str = "a good     example";
//        String reversedWords = "example good a";
//
//        String result = LeetCodePractice.reverseWords(str);
//        assertEquals(reversedWords, result);
//    }
//
//    @Test
//    public void TestCase2LeetCodePractice(){
//        String str = "the sky is blue";
//        String reversedWords = "blue is sky the";
//
//        String result = LeetCodePractice.reverseWords(str);
//        assertEquals(reversedWords, result);
//    }
//
//    @Test
//    public void TestCase3LeetCodePractice(){
//        String str = "  hello world  ";
//        String reversedWords = "world hello";
//
//        String result = LeetCodePractice.reverseWords(str);
//        assertEquals(reversedWords, result);
//    }

}
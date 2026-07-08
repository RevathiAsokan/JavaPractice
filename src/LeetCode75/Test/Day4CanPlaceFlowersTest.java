package LeetCode75.Test;

import LeetCode75.Day4CanPlaceFlowers;
import LeetCode75.LeetCodePractice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Day4CanPlaceFlowersTest {

    @Test
    public void TestCase1(){
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = true;
        Boolean canPlaceFlowers = Day4CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertEquals(result, canPlaceFlowers);
    }

    @Test
    public void TestCase2(){
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean result = false;
        Boolean canPlaceFlowers = Day4CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertEquals(result, canPlaceFlowers);
    }

    @Test
    public void TestCase1ForLeetCodePractice(){
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = true;
        Boolean canPlaceFlowers = LeetCodePractice.canPlaceFlowers(flowerbed, n);
        assertEquals(result, canPlaceFlowers);
    }

    @Test
    public void TestCase2ForLeetCodePractice(){
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean result = false;
        Boolean canPlaceFlowers = LeetCodePractice.canPlaceFlowers(flowerbed, n);
        assertEquals(result, canPlaceFlowers);
    }

    @Test
    public void TestCase3ForLeetCodePractice(){
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        int n = 2;
        boolean result = false;
        Boolean canPlaceFlowers = LeetCodePractice.canPlaceFlowers(flowerbed, n);
        assertEquals(result, canPlaceFlowers);
    }


}
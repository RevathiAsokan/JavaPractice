package LeetCode75;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodePractice {

    public static void main(String[] args){

       //can place flowers
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;

        System.out.println("Can place flowers: " + canPlaceFlowers(flowerbed, n));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        int count = 0;
        for(int i = 0 ; i < flowerbed.length ; i++){
            if(flowerbed[i] == 0){
                int prev = (i == 0) ? 0 : flowerbed[i-1];
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i+1];

                if(prev == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}

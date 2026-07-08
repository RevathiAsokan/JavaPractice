package LeetCode75;

import java.util.Arrays;

public class Day5ReverseVowels {

    public static void main(String[] args){

        //String word = "IceCreAm";
        String word = "leetcode";

        System.out.println("Reverse vowel string : " + reverseVowels(word));

    }

    private static boolean isNotVowel(char c){
        return "aeiouAEIOU".indexOf(c) == -1;
    }

    public static String reverseVowels(String str){

        char[] chars = str.toCharArray();
        int left = 0, right = chars.length-1;

        while(left < right){
            if(isNotVowel(chars[left])){
                left++;
            } else if(isNotVowel(chars[right])){
                right--;
            } else {
                //swap
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

//Use below to skip consecutive non-vowels faster
//        while (left < right) {
//            while (left < right && isNotVowel(chars[left]))
//                left++;
//            while (left < right && isNotVowel(chars[right]))
//                right--;
//
//            //swap
//            char temp = chars[left];
//            chars[left++] = chars[right];
//            chars[right--] = temp;
//
//        }
        return new String(chars);
    }

}

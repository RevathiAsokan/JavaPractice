package LeetCode75;

//You are given two strings word1 and word2.
//Merge the strings by adding characters in alternating order, starting with word1.
//If one string is longer than the other, append the additional characters at the end of the merged string.

public class Day1MergeStringsAlternatively1 {

    public static void main(String[] args){

        String word1 = "abcd", word2 = "pq";
        System.out.println("Merged String Alternatively : " + mergedString(word1, word2));

    }

    public static String mergedString(String word1, String word2){

        int length1 = word1.length();
        int length2 = word2.length();
        int min = Math.min(length1, length2);
        StringBuilder mergedString = new StringBuilder();
        int i = 0;

        while (i < min){
            mergedString.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }

        if(length1 > length2){
            mergedString.append(word1.substring(min));
        } else {
                mergedString.append(word2.substring(min));
        }

        return mergedString.toString();
    }

}

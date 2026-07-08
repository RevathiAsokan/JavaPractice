package LeetCode75;

public class Day1MergeStringsAlternatively {
    public static void main(String[] args){

        String word1 = "abcd";
        String word2 = "pq";
        System.out.println("Merged string : " + mergeAlternatively(word1, word2));
    }

    public static String mergeAlternatively(String word1, String word2){
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;

        while(i < length1 && j < length2) {
            mergedString.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }

        if(i < length1){
            mergedString.append(word1.substring(i));
        }
        if(j < length2){
            mergedString.append(word2.substring(j));
        }

        return mergedString.toString();
    }


}


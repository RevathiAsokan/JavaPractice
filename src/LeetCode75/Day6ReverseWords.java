package LeetCode75;

public class Day6ReverseWords {

    public static void main(String[] args){
        //String str = "the sky is blue";
        //String str = "  hello world  ";
        String str = "a good     example";
        System.out.println("Reversed words: " + reverseWords(str));
    }

    public static String reverseWords(String s){
        String[] str = s.trim().split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for(int i = str.length - 1; i >= 0; i--){
            reversedString.append(str[i]);
            if(i > 0) reversedString.append(" ");
        }
        return reversedString.toString();
    }
}

package LeetCode75;

//For two strings s and t, we say “t divides s” if and only if:
//s = t + t + t + ... + t (i.e., t is concatenated with itself one or more times).
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//Example 1
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
//Example 4
//Inpt: str1 = "AAAAAB", str2 = "AAA"
//Output: ""
//Constraints
//1 <= str1.length, str2.length <= 1000
//str1 and str2 consist of uppercase English letters.

public class Day2GCDOfStrings {

    public static void main(String[] args){

        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println("GCD of strings : " + gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2){
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());

        return str1.substring(0, gcd);
    }

    private static int gcd(int a, int b){
        while(b != 0){  //repeat till mod returns 0
            int temp = b;  //storing in temp variable, as it must be swapped in a, b will be the new remainder
            b = a % b;
            a = temp;
        }

        return a;


    }

}

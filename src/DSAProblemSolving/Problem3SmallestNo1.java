package DSAProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem3SmallestNo1 {

    public static void main(String[] args){

        int n = 81000;

        System.out.println("Smalles nmber whose product of digits is N : " + smallestNo1(n));

    }

    public static String smallestNo1(int n){

        String num = "";

        for(int i = 9; i >= 2; i--){
            while(n % i ==  0){
                n = n / i;
                num = i + num;
            }
        }

        if(n != 1){
            return "-1";
        } else {
            return num;
        }
    }

}

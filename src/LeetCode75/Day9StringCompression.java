package LeetCode75;

public class Day9StringCompression {

    public static void main(String[] args){
        //char[] charArray ={'a','a','b','b','c','c'};
        char[] charArray ={'a'};
        //char[] charArray ={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println("String compression : " + stringCompression(charArray));
    }

    public static int stringCompression(char[] chars){
        int read =0, write =0;
        while(read < chars.length){
            char currChar = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == currChar){
                read++;
                count++;
            }
            chars[write++] = currChar;
            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}

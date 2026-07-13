package LeetCode75;

public class Day8IncreasingTripletSubSeq {

    public static void main(String[] args){

        //int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {2,1,5,0,4,6};
        //int[] nums = {5, 4, 3, 2, 1};

        System.out.println("Increasing Triplet Subsequence : " + incTripletSubSeqExist(nums));
    }

    public static boolean incTripletSubSeqExist(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;


        for(int num : nums){
            if(num <= first){
                first = num;
            } else if (num <= second){
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}

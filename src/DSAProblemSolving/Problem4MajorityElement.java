package DSAProblemSolving;
public class Problem4MajorityElement {
    public static void main(String[] args){
       // int[] elements = {4, 4, 3, 4, 7, 3, 4, 4, 7, 4, 4, 7, 4, 4};
        int[] elements = {2, 2, 6, 6, 6, 2, 2, 8, 2, 2};
        System.out.println("Maximum identity : " + majorityElement(elements));
    }
    public static int majorityElement(int[] elements){
        int n = elements.length;
        int candidate = elements[0];
        int vote = 0;
        //find the candidate
        for (int element : elements) {
            if (candidate == element)
                vote++;
            else
                vote--;
            if (vote == 0) {
                candidate = element;
                vote++;
            }
        }
        //find the frequency of the candidate
        vote = 0;
        for(int element : elements){
            if(candidate ==  element) {
                vote++;
            }
        }
        if(vote >= n/2)
            return candidate;
        else
            return -1;
    }
}

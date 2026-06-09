import java.util.*;

public class Sample {

    public static void kadanes(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            int start = i;
            for(int j=i; j<nums.length; j++) {
                int end = j;
                for (int k= start; k <end; k++) {
                    currSum = currSum + nums[k];
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { -1, -2, -3, -4 };
        kadanes(nums);
    }
}

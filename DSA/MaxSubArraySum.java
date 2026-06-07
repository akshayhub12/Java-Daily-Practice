public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0; // To store current sub array sum
        int maxSum = Integer.MIN_VALUE; // Minimum value
        for (int i = 0; i < numbers.length; i++) {
            int start = i; // Start of Sub Array
            for (int j = i; j < numbers.length; j++) {
                int end = j; // End of Sub Array
                currSum = 0;
                for (int k = start; k < end; k++) {
                    // Sub Array Sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) { // if current sum is maximum than maxSum
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max SubarraySum is " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubArraySum(numbers);
    }
}

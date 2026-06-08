public class PreFixSum {

    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0; // To store current sub array sum
        int maxSum = Integer.MIN_VALUE; // Minimum value
        int preFix[] = new int[numbers.length];

        preFix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < preFix.length; i++) {
            preFix[i] = preFix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i; // Start of Sub Array
            for (int j = i; j < numbers.length; j++) {
                int end = j; // End of Sub Array
                currSum = start == 0 ? preFix[end] : preFix[end] - preFix[start - 1];

                if (maxSum < currSum) { // if current sum is maximum than maxSum
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max SubarraySum is " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubArraySum(numbers);
    }
}

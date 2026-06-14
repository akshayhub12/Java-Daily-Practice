public class BuyAndSellStock {

    public static boolean appearTwice(int nums[]) {
        int n = nums.length - 1;
        for (int i= 0; i<n; i++) {
            int start = i;
            for (int j= i+1; j<n; j++) {
                if (nums[i]==nums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(appearTwice(nums));
    }
}

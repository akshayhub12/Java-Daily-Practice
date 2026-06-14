public class DuplicateInArray {

    public static boolean containsDuplicate(int nums[]) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int nums[] = { 7, 1, 5, 3, 1, 6, 4 };

        System.out.println(containsDuplicate(nums));
    }
}
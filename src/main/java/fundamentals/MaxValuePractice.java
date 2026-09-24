package fundamentals;

public class MaxValuePractice {
    public static void main(String[] args) {
        int[] nums = {4, 11, 3, 8, 6};

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Max value: " + max);
    }
}

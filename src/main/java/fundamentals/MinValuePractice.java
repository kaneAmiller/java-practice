package fundamentals;

public class MinValuePractice {
    public static void main(String[] args) {
        int[] nums = {4, 11, 3, 8, 6};

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Min value: " + min);
    }
}

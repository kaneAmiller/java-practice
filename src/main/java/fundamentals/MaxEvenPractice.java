package fundamentals;

public class MaxEvenPractice {
    public static void main(String[] args) {
        int[] nums = {-7, -4, -10, 8, 6};

        boolean foundEven = false;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            // First valid even number gets accepted automatically.
            // After that, only a larger even number replaces max.
            if (nums[i] % 2 == 0 && (!foundEven || nums[i] > max)) {
                max = nums[i];
                foundEven = true;
            }
        }

        if (foundEven) {
            System.out.println("Largest even value: " + max);
        } else {
            System.out.println("No even value found.");
        }
    }
}

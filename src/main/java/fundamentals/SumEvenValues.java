package fundamentals;

public class SumEvenValues {
    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 9, 6};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }

        System.out.println("Sum of even values: " + sum);
    }
}

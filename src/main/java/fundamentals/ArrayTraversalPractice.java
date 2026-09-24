package fundamentals;

public class ArrayTraversalPractice {
    public static void main(String[] args) {
        int[] nums = {4, 9, 2, 11};

        // Use an indexed for loop when the index matters.
        for (int i = 0; i < nums.length; i++) {
            System.out.println("index " + i + " -> value " + nums[i]);
        }
    }
}

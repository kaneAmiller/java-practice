package fundamentals;

public class ForEachEvenPractice {
    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 12, 7, 4};

        // Use for-each when only the values matter and the index is not needed.
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}

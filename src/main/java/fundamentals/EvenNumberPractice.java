package fundamentals;

public class EvenNumberPractice {

    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 12, 7, 4};

        int sum = sumEvenNumbers(nums);
        int count = countEvenNumbers(nums);

        System.out.println(sum);
        System.out.println(count);
    }

    static int countEvenNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                count += 1;
            }
        }

        return count;
    }

    static int sumEvenNumbers(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }
}

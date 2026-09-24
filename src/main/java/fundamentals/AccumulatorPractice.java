package fundamentals;

public class AccumulatorPractice {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        System.out.println("Sum 1 through 5: " + sum);

        int evenSum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }

        System.out.println("Sum of evens 1 through 10: " + evenSum);
    }
}

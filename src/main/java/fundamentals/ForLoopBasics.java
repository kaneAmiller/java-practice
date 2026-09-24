package fundamentals;

public class ForLoopBasics {
    public static void main(String[] args) {
        // Print 0 through 5.
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Print 1 through 5.
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Count up by 2: 2, 4, 6, 8, 10.
        for (int i = 2; i < 11; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        // Count down by 2: 10, 8, 6, 4, 2.
        for (int i = 10; i > 1; i -= 2) {
            System.out.println(i);
        }
    }
}

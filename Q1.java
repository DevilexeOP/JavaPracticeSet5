public class Q1 {
    public static void main(String[] args) throws Exception {
        System.out.println("This is a Practice Set #5 || Question 1");

        // Q1 => Print the pattern
        // ****
        // ***
        // **
        // *

        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

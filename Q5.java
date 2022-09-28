public class Q5 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #5 || Question 5");

        // Q5 => Find the factorial of the number

        int num = 5;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

    }
}

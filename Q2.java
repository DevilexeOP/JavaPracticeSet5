import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("This is a Practice Set #5 || Question 2");

        // Q2 => Write a program to sum first n even numbers using while loop

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter even numbers to find the sum");
            int sum = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                sum = sum + (2 * i);
            }

            System.out.println("Sum of even number is ");
            System.out.println(sum);

        } finally {
            sc.close();
        }

    }
}

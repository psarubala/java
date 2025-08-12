
import java.util.*;

public class armstrong {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value: ");
        int num = sc.nextInt();
        int count = 0;

        // Step 1: Count number of digits
        int temp = num;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Compute the sum of digits raised to the power of 'count'
        int sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;

            // Compute digit^count without using Math.pow()
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }

            sum += power;
            temp = temp / 10;
        }

        // Step 3: Check if Armstrong
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read an integer from the user's input.
        int count = 0; // Initialize a count variable to 0 to count the number of divisors.

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++; // If 'n' is divisible by 'i' without a remainder, increment the count.
            }
        }

        if (count == 2) {
            System.out.println("Prime"); // If 'count' is equal to 2, it's a prime number.
        } else {
            System.out.println("Not Prime"); // If 'count' is not 2, it's not a prime number.
        }
    }
}

/* 
Explanation:

The program starts by importing the Scanner class to read input from the user.
It uses the Scanner class to read an integer (n) from the user.
A count variable is initialized to 0. This variable will be used to count the number of divisors of the input number.
The program enters a for loop that iterates from i = 1 to i <= n. It checks each number from 1 to n to see if it's a divisor of n.
Inside the loop, the if statement checks if n is divisible by i (i.e., if n % i == 0). If it is, the count variable is incremented by 1.
After the loop, the program checks if the count variable is equal to 2. If it is, it means that the input number has only two divisors (1 and itself), so it prints "Prime."
If the count variable is not equal to 2, it means the input number has more than two divisors, so it prints "Not Prime."
*/

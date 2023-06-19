//Generate 500 unique unsorted random numbers from 0-1000 and prints the nth smallest number based on user input.

package practical1;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NthSmallestNumber {
	public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        int count = 0;

        // Generate 10 unique random numbers
        while (count < 10) {
            int randomNumber = random.nextInt(1001);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
                count++;
            }
        }

        System.out.println("Generated unique random numbers: " + numbers);

        // Get user input for n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Find the nth smallest number
        if (n > 0 && n <= numbers.size()) {
            int nthSmallest = numbers.stream().sorted().skip(n - 1).findFirst().orElse(-1);
            System.out.println("The " + n + "th smallest number is: " + nthSmallest);
        } else {
            System.out.println("Invalid input! Please enter a value between 1 and " + numbers.size());
        }
        
        scanner.close();
    }
}
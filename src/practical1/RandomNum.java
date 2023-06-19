//Generate 10 random numbers between 0-10. 

package practical1;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random rnum = new Random();
		System.out.println("Here are 10 random numbers: ");

		for (int i = 0; i < 10; i++) {
			System.out.print(rnum.nextInt(10) + "  ");
		}
	}
}

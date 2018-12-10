package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class HighlyDivisibleTriangleNumber {

	public HighlyDivisibleTriangleNumber(int divisors) {
    long time = startTimer();    
    print(START, "Starting challenge - Highly divisible Triangle number");
		
		int currentDivisors = 0;
		int triangle = 0;
		int loop = 1;
		while (currentDivisors <= divisors) {
			triangle = triangle + loop;
			loop++;			
			currentDivisors = numberOfDivisors(triangle);
			//print(DEBUG, "" + triangle + "-" + currentDivisors);
		}
		
    print(END, "The first triangle number to have " + divisors + " divisors is " + triangle);
    endTimer(time);
	}
}

package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class LargeSum {

	public LargeSum(String largeNumber, int validDigits, int digits) {
    long time = startTimer();    
    print(START, "Starting challenge - Large Sum");
    
    int sum = 0;
    int numberQuantity = largeNumber.length() / digits;
    for(int number = 1; number <= numberQuantity; number++) {
    	largeNumber.
    }
    
    print(END, "The first " + validDigits + " digits of the sum of the following " + digits + " digit numbers is " + sum);
    endTimer(time);
	}
}
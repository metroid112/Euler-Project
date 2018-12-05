package challenges;

import java.util.Arrays;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class SmallestMultiple {

	public SmallestMultiple(int limit) {
    startTimer();    
    print(START, "Starting challenge - Smallest Multiple");
    
    int[] factors = new int[limit];
    Arrays.setAll(factors, a -> a + 1);
  	int lcm = lcm(factors);
    
    print(END, "The smallest multiple of numbers 1 to " + limit + " is " + lcm);
    endTimer();
	}
}

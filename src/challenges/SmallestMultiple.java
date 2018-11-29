package challenges;

import java.util.Arrays;

import main.Utils;

public class SmallestMultiple {

	public SmallestMultiple(int limit) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Smallest Multiple");
    
    int[] factors = new int[limit];
    Arrays.setAll(factors, a -> a + 1);
  	int lcm = Utils.lcm(factors);
    
    Utils.print("[END] The smallest multiple of numbers 1 to " + limit + " is " + lcm);
    Utils.endTimer();
	}
}

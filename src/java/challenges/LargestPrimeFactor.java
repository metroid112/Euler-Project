package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class LargestPrimeFactor {

  public LargestPrimeFactor(long prime) {
    long time = startTimer();    
    print(START, "Starting challenge - Largest Prime factor");

    long factor = 2;
    while (prime != 1) {
    	for (factor = 2; factor <= prime; factor++) {
    		print(DEBUG, "Checking if " + Long.toString(factor) + " is a prime factor");
    		if (prime % factor == 0 && isPrime(factor)) {
    			print(DEBUG, "" + Long.toString(factor) + " is a prime factor");
	    		prime /= factor;
	    		break;
	    	}
    	}
    }
    
    print(END, "The largest prime factor of " + Long.toString(prime) + " is " + Long.toString(factor));
    endTimer(time);
  }
}

package challenges;

import main.Utils;

public class LargestPrimeFactor {

  public LargestPrimeFactor(long prime) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Prime factor");

    long factor = 2;
    while (prime != factor) {
    	for (factor = 2; factor <= prime; factor++) {
    		Utils.print("[INFO] Checking if " + Long.toString(factor) + " is a prime factor");
    		if (prime % factor == 0 && Utils.isPrime(factor)) {
    			Utils.print("[INFO] " + Long.toString(factor) + " is a prime factor");
	    		prime /= factor;
	    		break;
	    	}
    	}
    }
    
    Utils.print("[END] The largest prime factor of " + Long.toString(prime) + " is " + Long.toString(factor));
    Utils.endTimer();
  }
}

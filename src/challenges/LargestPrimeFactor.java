package challenges;

import main.Utils;

public class LargestPrimeFactor {

  public LargestPrimeFactor(long prime) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Prime factor");

    long factor = 1;
    for (long factorPrime = prime / 2; factorPrime >= 1; factorPrime--) {
    	Utils.print("[INFO] Trying with " + Long.toString(factorPrime));
    	if (Utils.isPrime(factorPrime) && prime % factorPrime == 0) {
    		factor = factorPrime;
    	}
    }
    
    Utils.print("[END] The largest prime factor of " + Long.toString(prime) + " is " + Long.toString(factor));
    Utils.endTimer();
  }
}

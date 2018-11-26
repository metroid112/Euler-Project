package challenges;

import main.Utils;

public class LargestPrimeFactor {

  public LargestPrimeFactor(long prime) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Prime factor");

    long limit = (long) Math.floor(prime / 2);
    long factor = 2;
    for (long primes = limit; primes >= 2; primes--) {
    	Utils.print("[INFO] Checking if prime divisor " + primes);
    	if (Utils.isPrime(primes) && prime % primes == 0) {
    		factor = primes;
    		break;
    	}
    }
    
    Utils.print("[END] The largest prime factor of " + Long.toString(prime) + " is " + Long.toString(factor));
    Utils.endTimer();
  }
}

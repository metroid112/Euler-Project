package challenges;

import java.util.List;

import main.Utils;

public class LargestPrimeFactor {

  public LargestPrimeFactor(long prime) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Prime factor");

    long factor = 2;
    List<Boolean> primesSieve = Utils.sieveOfEratosthenes(100);
    long limit = (long) Math.floor(prime / 2);
    for (int i = 2; i < primesSieve.size(); i++) {
    	if (primesSieve.get(i) && prime % i == 0) {
    		prime /= i;
    	}
    }
    for (long primes = limit; primes >= 2; primes--) {
    	Utils.print("[INFO] Checking if prime divisor " + primes);
    	if (prime % primes == 0 && Utils.isPrime(primes)) {
    		factor = primes;
    		break;
    	}
    }
    
    Utils.print("[END] The largest prime factor of " + Long.toString(prime) + " is " + Long.toString(factor));
    Utils.endTimer();
  }
}

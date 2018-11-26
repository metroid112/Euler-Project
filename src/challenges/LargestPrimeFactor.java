package challenges;

import java.util.List;

import main.Utils;

public class LargestPrimeFactor {

  public LargestPrimeFactor(long prime) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Prime factor");

    long limit = Math.round(Math.sqrt(prime));
    List<Boolean> primes = Utils.sieveOfEratosthenes(limit);
    
    Utils.print("[END] The largest prime factor of " + Long.toString(prime) + " is " + Long.toString(factor));
    Utils.endTimer();
  }
}

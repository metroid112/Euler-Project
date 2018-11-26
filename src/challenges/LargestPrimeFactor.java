package challenges;

import main.Utils;

public class LargestPrimeFactor {

  public LargestPrimeFactor(long prime) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Even Fibonacci numbers");

    long factor = prime / 2;
    while (!Utils.isPrime(factor) && factor >= 2) {
      while (prime % factor != 0 && factor >= 2) {
        factor -= 1;
      }
    }
    
    Utils.print("[END] The largest prime factor of " + Long.toString(prime) + " is " + Long.toString(factor));
    Utils.endTimer();
  }
}

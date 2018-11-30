package challenges;

import main.Utils;

public class TenThousandFirstPrime {

  public TenThousandFirstPrime(int primePlace) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - 10001st Prime");
    
    int prime = 2;
    for (int i = 1; i <= primePlace; i++) {
      // FIND NEXT PRIME
      while(!Utils.isPrime(prime)) {
        
      }
    }
    
    Utils.print("[END] The prime in the place " + primePlace + " is " + prime);
    Utils.endTimer();
  }
}

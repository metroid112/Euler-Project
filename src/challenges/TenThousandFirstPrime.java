package challenges;

import java.util.ArrayList;
import java.util.List;

import main.Utils;

public class TenThousandFirstPrime {

  public TenThousandFirstPrime(int primePlace) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - 10001st Prime");
    
    int prime = 3;
    List<Integer> multiples = new ArrayList<Integer>();
    multiples.add(2);
    multiples.add(3);
    for (int i = 3; i <= primePlace; i++) {
    	while(!Utils.isPrime(prime)) {
    		for (int multiple : multiples) {
    			prime += multiple + 1;
    		}
    	}
    }
    
    Utils.print("[END] The prime in the place " + primePlace + " is " + prime);
    Utils.endTimer();
  }
}

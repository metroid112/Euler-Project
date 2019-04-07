package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class SummationOfPrimes {

	public SummationOfPrimes(int limit) {
    long time = startTimer();    
    print(START, "Starting challenge - Summation of primes");
    
    long summation = 0;
    boolean[] primes = sieveOfEratosthenes(limit);
    for (int i = 2; i <= limit; i++) {
    	if (primes[i]) {
    		summation += i;
    	}
    }
    
    print(END, "The summation of primes up to " + limit + " is " + summation);
    endTimer(time);
	}
}

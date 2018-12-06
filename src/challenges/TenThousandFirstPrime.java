package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class TenThousandFirstPrime {

  public TenThousandFirstPrime(int primePlace) {
    long time = startTimer();    
    print(START, "Starting challenge - 10001st Prime");
    
    int i;
    int nth;
    for (i = 2, nth = 0; nth < primePlace; i++) {
    	print(DEBUG, Integer.toString(nth));
    	if(isPrime(i)) {
    		nth++;
    	}
    }
    
    // https://stackoverflow.com/questions/9625663/calculating-and-printing-the-nth-prime-number faster solution
    print(END, "The prime in the place " + primePlace + " is " + (i - 1));
    endTimer(time);
  }
}

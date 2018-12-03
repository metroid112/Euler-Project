package challenges;

import main.Utils;

public class TenThousandFirstPrime {

  public TenThousandFirstPrime(int primePlace) {
    Utils.startTimer();    
    Utils.print(Utils.PRINT.START, "Starting challenge - 10001st Prime");
    
    int i;
    int nth;
    for (i = 2, nth = 0; nth < primePlace; i++) {
    	Utils.print(Utils.PRINT.DEBUG, Integer.toString(nth));
    	if(Utils.isPrime(i)) {
    		nth++;
    	}
    }
    
    // https://stackoverflow.com/questions/9625663/calculating-and-printing-the-nth-prime-number faster solution
    Utils.print(Utils.PRINT.END, "The prime in the place " + primePlace + " is " + (i - 1));
    Utils.endTimer();
  }
}

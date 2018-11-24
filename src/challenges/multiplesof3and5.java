package challenges;

import main.Utils;

public class multiplesof3and5 {

  public multiplesof3and5(final long limit) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Multiples of 3 and 5");
    
    long sum = 0;
    long multiple = 3;
    while (multiple < limit) {
      if(((multiple % 3) == 0) || ((multiple % 5) == 0)) {
        Utils.print("[INFO] " + Long.toString(multiple) + " is a multiple of 3 or 5");
        sum += multiple;
      }
      multiple++;
    }
    
    Utils.print("[END] Sum of the multiples of 3 and 5 is " + Long.toString(sum));
    Utils.endTimer();
  }
}

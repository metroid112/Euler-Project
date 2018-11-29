package challenges;

import main.Utils;

public class SmallestMultiple {

	public SmallestMultiple(int limit) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Smallest Multiple");
    
    limit = 20;
    int factor = 2;
    int multiple = limit;
    int jumps = 1;
    while (factor != limit) {
      Utils.print("[INFO] Checking the factors of " + multiple);
      if (multiple % factor == 0) {
        for (int i = factor; i <= limit; i++) {
          if (multiple % i == 0) {
            Utils.print("[INFO] " + multiple + " is a multiple of " + i);  
            jumps++;
            factor = i;            
          } else {
        		multiple += limit;
            break;
          }
        }
      } else {
        multiple += limit;
        factor = 2;
      }
    }
    
    Utils.debug(jumps);
    Utils.print("[END] The smallest multiple of numbers 1 to " + limit + " is " + multiple);
    Utils.endTimer();
	}
}

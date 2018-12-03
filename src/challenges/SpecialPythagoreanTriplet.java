package challenges;

import main.Utils;

public class SpecialPythagoreanTriplet {

	public SpecialPythagoreanTriplet(int result) {
    Utils.startTimer();    
    Utils.print(Utils.PRINT.START, "Starting challenge - Special Pythagorean Triplet");
    
    int a = 3;
    int b = 4;
    int c = 5;
    while (a + b + c != result 
    		&& !Utils.isPythagoreanTriplet(a, b, c)) {
    	c++;
    	while (b + 1 < c || (a + b + c == result 
      		&& Utils.isPythagoreanTriplet(a, b, c))) {
    		b++;
    	}
    	while (a + 1 < b || (a + b + c == result 
    		&& Utils.isPythagoreanTriplet(a, b, c))) {
    		a++;
    	}
    	Utils.debug(a,b,c);
    	Utils.print(Utils.PRINT.DEBUG, "********");
    }
    
    Utils.print(Utils.PRINT.END, "The Pythagorean Triplet (" + a + "," + b + "," + c + ") sums " + result);
    Utils.endTimer();
	}
}

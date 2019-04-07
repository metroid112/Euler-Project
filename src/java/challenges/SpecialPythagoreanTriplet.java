package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class SpecialPythagoreanTriplet {

	public SpecialPythagoreanTriplet(int result) {
    long time = startTimer();    
    print(START, "Starting challenge - Special Pythagorean Triplet");
    
    int a = 1;
    int b = 1;
    int c = 1;
    boolean found = false;
    for (c = 5; c <= result && !found; c++) {
    	for (b = 4; b <= c && !found; b++) {
    		for (a = 3; a <= b && !found; a++) {
    			found = isPythagoreanTriplet(a,b,c) && a + b + c == result;
    		}
    	}
    }
    a--;
    b--;
    c--;
    
    print(END, "The Pythagorean Triplet (" + a + "," + b + "," + c + ") sums " 
    + (a + b + c) + ", expected result is " + result + ". \nTheir product is " + (a * b * c));
    endTimer(time);
	}
}

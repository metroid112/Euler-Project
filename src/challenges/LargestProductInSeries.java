package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class LargestProductInSeries {

	public LargestProductInSeries(String number, int consecutiveDigits) {
    long time = startTimer();    
    print(START, "Starting challenge - Largest product in a series");
    
    long largestProduct = 1;
    long product = 1;
    int startPosition = 0;
    int endPosition = 0;
    char[] digits = number.toCharArray();
    int seriesLength = digits.length;
    for (int i = 0; i <= seriesLength; i++) {
    	product = 1;
    	startPosition = i;
    	endPosition = i + consecutiveDigits - 1;
    	if (endPosition >= seriesLength) {
    		endPosition = seriesLength - 1;
    	}
    	for (int j = startPosition; j <= endPosition; j++) {
    		print(DEBUG, String.valueOf(digits[j]));
    		product *= value(digits[j]);
    	}
    	if (product >= largestProduct) {
    		largestProduct = product;
    	}
    }
    
    print(END, "The largest product in the series is " + largestProduct);
    endTimer(time);
	}
}

package challenges;

import main.Utils;

public class LargestProductInSeries {

	public LargestProductInSeries(String number, int consecutiveDigits) {
    Utils.startTimer();    
    Utils.print(Utils.PRINT.START, "Starting challenge - Largest product in a series");
    
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
    		Utils.print(Utils.PRINT.DEBUG, String.valueOf(digits[j]));
    		product *= Utils.value(digits[j]);
    	}
    	if (product >= largestProduct) {
    		largestProduct = product;
    	}
    }
    
    Utils.print(Utils.PRINT.END, "The largest product in the series is " + largestProduct);
    Utils.endTimer();
	}
}

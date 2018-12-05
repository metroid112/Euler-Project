package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class LargestPalindromeProduct {
	
	public LargestPalindromeProduct(int digits) {
    startTimer();    
    print(START, "Starting challenge - Largest Palindrome product");
    
    int largestPalindrome = 1;
    int limit = (int) Math.pow(10, digits) - 1;
    String lowerBoundString = "";
    String lowBoundString = "1";
    for (int s = 1; s <= digits; s++) {
    	lowerBoundString += Integer.toString(1);
    	lowBoundString   += Integer.toString(0);
    }
    int lowerBound = Integer.valueOf(lowerBoundString);
    int lowBound   = Integer.valueOf(lowBoundString);
    
    int i;
    boolean found = false;
    for (i = limit * limit; !found && i >= lowerBound; i--) {
    	for (int j = lowerBound * 9; !found && j >= 1; j--) {
    		if (i % j == 0 && i / j < lowBound && isPalindrome(i)) {
    			found = true;
    		}
    	}
    }
    
    print(END, "The largest Palindrome product between 2 numbers of " + digits + " digits is " + largestPalindrome);
    endTimer();
	}
}

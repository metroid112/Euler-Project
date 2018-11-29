package challenges;

import main.Utils;

public class LargestPalindromeProduct {
	
	public LargestPalindromeProduct(int digits) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Palindrome product");
    
    int largestPalindrome = 1;
    int limit = (int) Math.pow(10, digits) - 1;
    String lowerBoundString = "";
    for (int s = 1; s <= digits; s++) {
    	lowerBoundString += Integer.toString(1);
    }
    int lowerBound = Integer.valueOf(lowerBoundString);
    Utils.debug(lowerBound);
    Utils.debug(limit);
//    for (int i = limit; i >= lowerBound; i--) {
//    	for (int j = limit; j >= lowerBound; j--) {
//    		Utils.print("[INFO] Checking if " + i + "*" + j + " = " + i*j + " is a Palindrome");
//    		if (i * j >= largestPalindrome && Utils.isPalindrome(i * j)) {
//    			Utils.print("[INFO] " + i*j + " is a Palindrome");
//    			largestPalindrome = i * j;
//    		}
//    	}
//    }
    int k;
    boolean found = false;
    for (k = limit * limit; !found && k >= lowerBound; k--) {
    	for (int l = lowerBound * 9; !found && l >= 1; l--) {
    		if (k % l == 0 && k / l < 1000 && Utils.isPalindrome(k)) {
    			found = true;
    		}
    	}
    }
    // TODO: Optimize
    Utils.print("found it " + (k + 1));
    
    Utils.print("[END] The largest Palindrome product between 2 numbers of " + digits + " digits is " + largestPalindrome);
    Utils.endTimer();
	}
}

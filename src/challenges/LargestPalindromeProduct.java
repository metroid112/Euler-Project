package challenges;

import main.Utils;

public class LargestPalindromeProduct {
	
	public LargestPalindromeProduct(int digits) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Palindrome product");
    
    int largestPalindrome = 1;
    int limit = (int) Math.pow(10, digits * 2);
    for (int i = limit; i >= 1; i--) {
    	for (int j = limit; j >= 1; j--) {
    		if (Utils.isPalindrome(i * j)) {
    			largestPalindrome = i * j;
    			break;
    		}
    	}
    }
    
    Utils.print("[END] The largest Palindrome product between 2 numbers of " + digits + " is " + largestPalindrome);
    Utils.endTimer();
	}
}

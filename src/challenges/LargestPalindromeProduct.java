package challenges;

import main.Utils;

public class LargestPalindromeProduct {
	
	public LargestPalindromeProduct(int digits) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Largest Palindrome product");
    
    int largestPalindrome = 1;
    int limit = (int) Math.pow(10, digits);
    
    Utils.print("[END] The largest Palindrome product between 2 numbers of " + digits + " is " + largestPalindrome);
    Utils.endTimer();
	}
}

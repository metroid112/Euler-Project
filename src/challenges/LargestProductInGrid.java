package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class LargestProductInGrid {

	public LargestProductInGrid(int[][] grid, int consecutiveLimit) {
    startTimer();    
    print(START, "Starting challenge - Special Pythagorean Triplet");
    
    int largestProduct = 1;
    for (int i = 0; i <= grid.length; i++) {
    	for (int j = 0; j <= grid[0].length; j++) {
    		// GO IN 8 DIRECTIONS
    		int product = 1;
    		
    		if (product > largestProduct) {
    			largestProduct = product;
    		}
    	}
    }
    
    // list mayor a menor
    
    print(END, "The summation of primes up to ");
    endTimer();
	}
}

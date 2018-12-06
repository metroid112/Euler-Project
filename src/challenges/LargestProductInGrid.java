package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

import java.util.Arrays;

public class LargestProductInGrid {

	public LargestProductInGrid(int[][] grid, int consecutiveLimit) {
    long time = startTimer();    
    print(START, "Starting challenge - Special Pythagorean Triplet");
    
    int largestProduct = 1;
    for (int i = 0; i <= grid.length; i++) {
    	for (int j = 0; j <= grid[0].length; j++) {
    		// GO IN 8 DIRECTIONS
    		int[] product = new int[8];
    		Arrays.fill(product, grid[i][j]);
    		
    		for (int m = i - 3; m <= i + 3; m++) { // W -- E
	    		if (m < 0 || m >= grid.length || m == i) {
	    			product[0] *= 1;
	    			product[1] *= 1;
    			} else {
    				product[m < i ? 0 : 1] *= grid[m][j];
    			}
    		}
    		
    		for (int n = j - 3; n <= j + 3; n++) { // N | S
	    		if (n < 0 || n >= grid[i].length || n == j) {
	    			product[2] *= 1;
	    			product[3] *= 1;
    			} else {
    				product[n < j ? 2 : 3] *= grid[i][n];
    			}
    		}
    		
    		for (int o = -3; o <= 6; o++) {
    			if (o == 0 || i + o < grid.length || j + o < grid[i].length) {
    				product[4] *= 1;
    				product[5] *= 1;
    			} else {
    				product[i + o < i && j + o < j ? 4 : 5] *= grid[i + o][j + o]; 
    			}
    		}
    		
//    		for(;;) // NW \ SE
//	    		if (o < 0 || o >= grid[i].length || o == j) {
//	    			product[2] *= 1;
//	    			product[3] *= 1;
//    			} else {
//    				product[o < j ? 2 : 3] *= grid[i][o];
//    			}
//    		}
    		
//    		for (int n = j - 3; n <= j + 3; n++) { // SW / NE
//	    		if (n < 0 || n >= grid[i].length || n == j) {
//	    			product[2] *= 1;
//	    			product[3] *= 1;
//    			} else {
//    				product[n < j ? 2 : 3] *= grid[i][n];
//    			}
//    		}
    		
    		for (int result : product) {
    			if (result > largestProduct) {
    				largestProduct = result;
    			}
    		}
    	}
    }
    
    // list mayor a menor
    
    print(END, "The summation of primes up to " + largestProduct);
    endTimer(time);
	}
}

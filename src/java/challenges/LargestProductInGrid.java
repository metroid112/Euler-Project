package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

import java.util.Arrays;

public class LargestProductInGrid {

	public LargestProductInGrid(int[][] grid, int consecutiveLimit) {
    long time = startTimer();    
    print(START, "Starting challenge - Largest product in a grid");

    long largestProduct = 1;
    for (int i = 0; i < grid.length; i++) {
    	for (int j = 0; j < grid[0].length; j++) {
    		// GO IN 8 DIRECTIONS
    		long[] product = new long[8];
    		Arrays.fill(product, grid[i][j]);    		
    		
    		for (int m = i - consecutiveLimit + 1; m <= i + consecutiveLimit - 1; m++) { // W -- E
	    		if (m < 0 || m >= grid.length || m == i) {
	    			product[0] *= 1;
	    			product[1] *= 1;
    			} else {
    				product[m < i ? 0 : 1] *= grid[i][m];
    			}
    		}
    		
    		for (int n = j - consecutiveLimit + 1; n <= j + consecutiveLimit - 1; n++) { // N | S
    			if (n < 0 || n >= grid[i].length || n == j) {
	    			product[2] *= 1;
	    			product[3] *= 1;
    			} else {
    				product[n < j ? 2 : 3] *= grid[n][j];
    			}
    		}
    		
    		for (int o = -consecutiveLimit + 1; o <= consecutiveLimit - 1; o++) { // NW \ SE
    			if (o == 0 || i + o < 0 || j + o < 0 || i + o >= grid.length || j + o >= grid[i].length) {
    				product[4] *= 1;
    				product[5] *= 1;
    			} else {
    				product[i + o < i && j + o < j ? 4 : 5] *= grid[i + o][j + o]; 
    			}
    		}
    		
    		for (int p = -consecutiveLimit + 1; p <= consecutiveLimit - 1; p++) { // SW / WE
    			if (p == 0  || i + p < 0 || j - p < 0 || i + p >= grid.length || j - p >= grid[i].length) {
    				product[6] *= 1;
    				product[7] *= 1;
    			} else {
    				product[i - p < i && j - p < j ? 6 : 7] *= grid[i + p][j - p]; 
    			}
    		}
    		
    		for (long result : product) {
    			if (result > largestProduct) {
    				largestProduct = result;
    			}
    		}
    	}
    }
    
    print(END, "The largest product in the grid is " + largestProduct);
    endTimer(time);
	}
}

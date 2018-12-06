package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

import java.util.Arrays;

public class LargestProductInGrid {

	public LargestProductInGrid(int[][] grid, int consecutiveLimit) {
    long time = startTimer();    
    print(START, "Starting challenge - Largest product in a grid");
    
//    for(int[] a : grid) {
//    	for (int b : a) {
//    		System.out.print(b + " ");
//    	}
//    	System.out.println();
//    }
    
    int largestProduct = 1;
    for (int i = 0; i < grid.length; i++) {
    	for (int j = 0; j < grid[0].length; j++) {
    		// GO IN 8 DIRECTIONS
    		int[] product = new int[8];
    		Arrays.fill(product, grid[i][j]);
    		print(DEBUG, "Center is " + grid[i][j]);
    		
    		for (int m = i - consecutiveLimit - 1; m <= i + consecutiveLimit - 1; m++) { // W -- E
    			print(DEBUG, "W - E");
	    		if (m < 0 || m >= grid.length || m == i) {
	    			product[0] *= 1;
	    			product[1] *= 1;
    			} else {
    				print(DEBUG, "Multiplying by " + grid[m][j]);
    				product[m < i ? 0 : 1] *= grid[m][j];
    			}
    		}
    		
    		for (int n = j - consecutiveLimit - 1; n <= j + consecutiveLimit - 1; n++) { // N | S
    			print(DEBUG, "N - S");
	    		if (n < 0 || n >= grid[i].length || n == j) {
	    			product[2] *= 1;
	    			product[3] *= 1;
    			} else {
    				print(DEBUG, "Multiplying by " + grid[i][n]);
    				product[n < j ? 2 : 3] *= grid[i][n];
    			}
    		}
    		
    		for (int o = -consecutiveLimit - 1; o <= 6; o++) { // SW / NE
    			print(DEBUG, "SW - NE");
    			if (o == 0 || i + o < 0 || j + o < 0 || i + o >= grid.length || j + o >= grid[i].length) {
    				product[4] *= 1;
    				product[5] *= 1;
    			} else {
    				print(DEBUG, "Multiplying by " + grid[i + o][j + o]);
    				product[i + o < i && j + o < j ? 4 : 5] *= grid[i + o][j + o]; 
    			}
    		}
    		
    		for (int p = -consecutiveLimit - 1; p <= 6; p++) { // NW \ SE
    			print(DEBUG, "NW - SE");
    			if (p == 0  || i - p < 0 || j - p < 0 || i - p >= grid.length || j - p >= grid[i].length) {
    				product[6] *= 1;
    				product[7] *= 1;
    			} else {
    				print(DEBUG, "Multiplying by " + grid[i - p][j - p]);
    				product[i - p < i && j - p < j ? 6 : 7] *= grid[i - p][j - p]; 
    			}
    		}
    		
    		for (int result : product) {
    			if (result > largestProduct) {
    				largestProduct = result;
    			}
    		}
    	}
    }
    
    // list mayor a menor
    
    print(END, "The largest product in the grid is " + largestProduct);
    endTimer(time);
	}
}

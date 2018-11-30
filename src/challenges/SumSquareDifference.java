package challenges;

import java.util.Arrays;

import main.Utils;

public class SumSquareDifference {

	public SumSquareDifference(int limit) {
    Utils.startTimer();    
    Utils.print("[START] Starting challenge - Sum square difference");
    
    int[] numbers = new int[limit];
    Arrays.setAll(numbers, a -> a + 1);
    int resultSquared = 0;
    int squaredResults = 0;
    for(int sum : numbers) {
    	resultSquared += sum;
    	squaredResults += Math.pow(sum, 2);
    	Utils.print("[INFO] Squared sum = " + squaredResults);
    }
    resultSquared = (int) Math.pow(resultSquared, 2);
    Utils.print("[INFO] Sum after squaring = " + resultSquared);
    
    Utils.print("[END] The difference between a squared sum and the sum of squares is " + (resultSquared - squaredResults));
    Utils.endTimer();
	}
}

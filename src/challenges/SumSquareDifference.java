package challenges;

import java.util.Arrays;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class SumSquareDifference {

	public SumSquareDifference(int limit) {
    long time = startTimer();    
    print(START, "Starting challenge - Sum square difference");
    
    int[] numbers = new int[limit];
    Arrays.setAll(numbers, a -> a + 1);
    int resultSquared = 0;
    int squaredResults = 0;
    for(int sum : numbers) {
    	resultSquared += sum;
    	squaredResults += Math.pow(sum, 2);
    	print(DEBUG, "Squared sum = " + squaredResults);
    }
    resultSquared = (int) Math.pow(resultSquared, 2);
    print(DEBUG, "Sum after squaring = " + resultSquared);
    
    print(END, "The difference between a squared sum and the sum of squares is " + (resultSquared - squaredResults));
    endTimer(time);
	}
}

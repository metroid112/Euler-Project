package challenges;

import static main.Utils.*;
import static main.Utils.PRINT.*;

public class EvenFibonacciNumbers {

  public EvenFibonacciNumbers(final long limit) {
    long time = startTimer();    
    print(START, "Starting challenge - Even Fibonacci numbers");

    long sum = 0;
    int fibo = 1;
    while (fibonacci(fibo) < limit) {
      if (fibonacci(fibo) % 2 == 0) {
        print(DEBUG, "" + Long.toString(fibonacci(fibo)) + " is an even Fibonacci number");
        sum += fibonacci(fibo);
      }
      fibo++;
    }
    
    print(END, "Sum of the even Fibonacci numbers of 3 and 5 is " + Long.toString(sum));
    endTimer(time);
  }
}

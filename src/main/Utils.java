package main;

import java.util.LinkedList;
import java.util.List;

public class Utils {
  
  private static long time;
  private static List<Long> fibonacciSumArray = new LinkedList<Long>();
  
  public Utils() {
    Utils.fibonacciSumArray.add(0, (long) 0);
    Utils.fibonacciSumArray.add(1, (long) 1);
  }
  
  public static enum PRINT {
    INFO,
    DEBUG
  }

  public static void print(String print) {
    System.out.println(print);
  }
  
  public static void startTimer() {
    Utils.time = System.nanoTime();
  }
  
  public static void endTimer() {
    Utils.print("[TIME] Execution time: " + ((System.nanoTime() - Utils.time) / 1000000) + " milliseconds");
  }
  
  public static void debug(long... debug) {
  	for (Long dbg : debug) {
  		Utils.print("[DEBUG] " + Long.toString(dbg));
  	}
  }
  
  public static long fibonacci(int fibonacci) {
    if (Utils.fibonacciSumArray.size() > fibonacci) {
      return Utils.fibonacciSumArray.get(fibonacci);
    } else {
      for (int i = Utils.fibonacciSumArray.size(); i <= fibonacci; i++) {
        Utils.fibonacciSumArray.add(i, Utils.fibonacciSumArray.get(i - 1) + Utils.fibonacciSumArray.get(i - 2));
      }
      return fibonacciSumArray.get(Utils.fibonacciSumArray.size() - 1);    
    }
  }
  
  public static List<Boolean> sieveOfEratosthenes(long prime) {
  	List<Boolean> primes = new LinkedList<Boolean>();
  	for (int i = 0; i <= prime; i++) {
  		primes.add(true);
  	}
    long limit = (long) Math.floor(Math.sqrt(prime));
    for (int i = 2; i <= limit; i++) { 
      if (primes.get(i)) {
      	for (int j = i * i; j <= prime; j += i) {
      		primes.set(j, false);
      	}
      }
    }
    return primes;
  }
  
  public static boolean isPrime(long prime) {
    if (prime <= 3) {
      return prime > 1;
    }
    if (prime % 2 == 0 || prime % 3 == 0) {
      return false;
    }
    long primeFactor = 5;
    while (primeFactor * primeFactor <= prime) {
      if (prime % primeFactor == 0 || prime % (primeFactor + 2) == 0) {
        return false;
      }
      primeFactor += 6;
    }
    return true;
  }
  
  public static boolean isPalindrome(int palindrome) {
  	String palindromeString = Integer.toString(palindrome);
  	int size = palindromeString.length();
  	int half = Math.round(size / 2);
  	StringBuilder reverse = new StringBuilder();
  	if (size % 2 == 0) {
  		reverse.append(palindromeString.substring(half));
  		reverse.reverse();
  		String reverseHalf = reverse.toString();
  		return palindromeString.substring(0, half).equals(reverseHalf);
  	} else {
  		reverse.append(palindromeString.substring(half + 1));
  		reverse.reverse();
  		String reverseHalf = reverse.toString();
  		return palindromeString.substring(0, half).equals(reverseHalf);
  	}
  }
  
  public static List<Integer> primeFactors(int multiple) {
  	return null;
  }
  
  public static int gcd(int a, int b) {
  	while (b > 0) {
  		int temp = b;
  		b = a % b;
  		a = temp;
  	}
  	return a;
  }
  
  public static int lcm(int a, int b) {
  	return a * (b / Utils.gcd(a, b));
  }
}

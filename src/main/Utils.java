package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.*;
import static main.Utils.PRINT.*;

public class Utils {
  
  private static List<Long> fibonacciSumArray = new LinkedList<Long>();
  private static boolean debug;
  
  public static enum PRINT {
    INFO,
    ALG,
    DEBUG,
    TIME,
    START,
    END,
    MAINSEP,
    SEP,
    DEFAULT
  }
  
  public Utils(boolean debug) {
  	Utils.debug = debug;
    fibonacciSumArray.add(0, (long) 0);
    fibonacciSumArray.add(1, (long) 1);
  }

  public static void print(PRINT type, String print) {
  	switch(type) {
  	case INFO:
  		out.println("[INFO] " + print);
  		break;
  	case ALG:
  		if (debug) {
  			out.println("----[ALGORITHM] " + print);
  		}
  		break;
  	case DEBUG:
  		if (debug) {
  			out.println("[DEBUG] " + print);
  		}	
  		break;
  	case TIME:
  		out.println("[TIME] " + print);
  		break;
  	case START:
  		out.println("[START] " + print);
  		break;
  	case END:
  		out.println("[END] " + print);
  		break;
		default:
			out.println(print);
  	}    
  }
  
  public static void print(PRINT type) {
  	switch(type) {
  	case MAINSEP:
  		out.println("************************************************************************");
  		break;
  	case SEP:
  		out.println("------------------------------------------------------------------------");
  		break;
		default:
			out.println("");
  	}
  }
  
  public static long startTimer() {
    return nanoTime();
  }
  
  public static void endTimer(long time) {
    print(TIME, "Execution time: " + ((nanoTime() - time) / 1000000) + " milliseconds");
  }
  
  public static void debug(long... debug) {
  	for (Long dbg : debug) {
  		print(DEBUG, Long.toString(dbg));
  	}
  }
  
  public static void debug(int... debug) {
  	for (int dbg : debug) {
  		print(DEBUG, Integer.toString(dbg));
  	}
  }
  
  public static long value(String longString) {
  	return Long.valueOf(longString);
  }
  
  public static int value(char intChar) { 
  	if (Character.isDigit(intChar)) {
  		return Integer.valueOf(Character.toString(intChar));
  	} else {
  		return 1;
  	}
  }
  
  public static long multiply(long... factors) {
  	long product = 1;
  	for (long factor : factors) {
  		product *= factor;
  	}
  	return product;
  }
  
  public static int multiply(int... factors) {
  	int product = 1;
  	for (int factor : factors) {
  		product *= factor;
  	}
  	return product;
  }
  
  public static boolean isPythagoreanTriplet(int a, int b, int c) {
  	return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
  }
  
  public static long fibonacci(int fibonacci) {
    if (fibonacciSumArray.size() > fibonacci) {
      return fibonacciSumArray.get(fibonacci);
    } else {
      for (int i = fibonacciSumArray.size(); i <= fibonacci; i++) {
        fibonacciSumArray.add(i, fibonacciSumArray.get(i - 1) + fibonacciSumArray.get(i - 2));
      }
      return fibonacciSumArray.get(fibonacciSumArray.size() - 1);    
    }
  }
  
//  public static List<Boolean> sieveOfEratosthenes(long prime) {
//    List<Boolean> primes = new LinkedList<Boolean>();
//    for (int i = 0; i <= prime; i++) {
//      primes.add(true);
//    }
//    long limit = (long) Math.floor(Math.sqrt(prime));
//    for (int i = 2; i <= limit; i++) { 
//      if (primes.get(i)) {
//        for (int j = i * i; j <= prime; j += i) {
//          primes.set(j, false);
//        }
//      }
//    }
//    return primes;
//  }
  
  public static boolean[] sieveOfEratosthenes(int prime) {
    boolean[] primes = new boolean[prime + 1];
    Arrays.fill(primes, true);
    int limit = (int) Math.floor(Math.sqrt(prime));
    for (int i = 2; i <= limit; i++) { 
      if (primes[i]) {
        for (int j = i * i; j <= prime; j += i) {
          primes[j] = false;
        }
      }
    }
    return primes;
  }
  
  public static boolean isPrime(long prime) {
  	print(ALG, "Checking if " + prime + " is prime");
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
  	print(ALG, "Using GCD algorithm between " + a + " and " + b);
  	while (b > 0) {
  		int temp = b;
  		b = a % b;
  		a = temp;
  	}
  	return a;
  }
  
  public static int gcd(int... numbers) {
  	int result = numbers[0];
  	for (int i = 1; i < numbers.length; i++) {
  		result = gcd(result, numbers[i]);
  	}
  	return result;
  }
  
  public static int lcm(int a, int b) {
  	print(ALG, "Using LCM algorithm between " + a + " and " + b);
  	return a * (b / gcd(a, b));
  }
  
  public static int lcm(int... numbers) {
  	int result = numbers[0];
  	for (int i = 1; i < numbers.length; i++) {
  		result = lcm(result, numbers[i]);
  	}
  	return result;
  }
}

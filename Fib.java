import java.util.Arrays;

public class Fib {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			fibA(i);
		}
	}
	
	/*
	 * Compute the nth term of the fibonacci sequence recursively
	 * 
	 * Assume non-negative n
	 */
	public static long fib(int n) {
		// base case: fib(0) = fib(1) = 1
		if(n == 0 || n == 1) {
			return 1;
		}
		// recursive case: fib(n) = fib(n-2) + fib(n-1)
		return fib(n-2) + fib(n-1);
	}
	
	/*
	 * Compute the nth term of the fibonacci sequence recursively
	 * 
	 * Assume non-negative n
	 * 
	 * Alternate version that uses an array to store previously computed values
	 */
	private static long[] fibA = new long[101];
	public static long fibA(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		// has the nth term already been computed?
		else if(fibA[n] > 0) {
			return fibA[n];
		}
		// the nth term has not yet been computed
		else {
			// 1. compute the nth term, and store it in the array
			fibA[n] = fibA(n-2) + fibA(n-1);
			// 2. return the stored values
			return fibA[n];
		}
	}
}

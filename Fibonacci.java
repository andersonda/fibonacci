public class Fibonacci {
    /*
        Computes the nth term of the fibonacci sequence recursively
     */
    public static long fib(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return fib(n-2) + fib(n-1);
        }
    }
}

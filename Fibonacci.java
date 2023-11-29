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

    /*
        Prints out the fibonacci sequence starting with
        start and ending with end
     */
    public static void printSequence(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.println(i + " " + fib(i));
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(10));

        printSequence(1, 8);
    }
}

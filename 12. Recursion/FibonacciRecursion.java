public class FibonacciRecursion{
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        for(int i=0;i<6;i++){
            System.out.print(fib(i)+" ");
        }
    }
}

public class SumUsingWhileLoop {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 5) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}

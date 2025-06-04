class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
}
public class ObjectMethodsExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(4, 5));
        System.out.println(c.multiply(4, 5));
    }
}

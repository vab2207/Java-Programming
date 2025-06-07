import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        float principal = sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Enter time period (in years): ");
        float time = sc.nextFloat();
        float interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
        sc.close();
    }
}

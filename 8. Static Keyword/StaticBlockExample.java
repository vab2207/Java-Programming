public class StaticBlockExample{
    static int x;

    static{
        x = 20;
        System.out.println("Static block executed");
    }

    public static void main(String[] args){
        System.out.println("Value of x: " + x);
    }
}

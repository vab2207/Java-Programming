public class StaticMethodExample{
    static int cube(int x){
        return x * x * x;
    }

    public static void main(String[] args){
        int result = cube(4);
        System.out.println("Cube: " + result);
    }
}

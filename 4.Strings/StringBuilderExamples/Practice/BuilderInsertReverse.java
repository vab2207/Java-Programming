public class BuilderInsertReverse{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("World");
        sb.insert(0, "Hello ");
        System.out.println("Inserted: " + sb);
        System.out.println("Reversed: " + sb.reverse());
    }
}

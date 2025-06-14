public class BuilderCapacityExample{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        System.out.println("Default capacity: " + sb.capacity());
        sb.append("Java is powerful");
        System.out.println("Updated content: " + sb);
    }
}

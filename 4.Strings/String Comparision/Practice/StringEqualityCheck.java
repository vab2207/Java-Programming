public class StringEqualityCheck{
    public static void main(String[] args){
        String s1 = "Test";
        String s2 = new String("Test");
        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
    }
}

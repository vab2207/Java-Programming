public class StringCaseInsensitiveCompare{
    public static void main(String[] args){
        String p = "Hello";
        String q = "hello";

        System.out.println(p.equals(q));         
        System.out.println(p.equalsIgnoreCase(q));     
    }
}

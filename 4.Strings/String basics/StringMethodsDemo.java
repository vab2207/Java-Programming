public class StringMethodsDemo{
    public static void main(String[] args){
        String text = "Welcome";

        System.out.println(text.length());
        System.out.println(text.charAt(3));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.substring(2));
        System.out.println(text.substring(1, 5));
        System.out.println(text.contains("come"));
        System.out.println(text.startsWith("Wel"));
        System.out.println(text.endsWith("e"));
        System.out.println(text.indexOf('e'));
        System.out.println(text.lastIndexOf('e'));
    }
}
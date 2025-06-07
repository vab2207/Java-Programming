public class StringLiteralVsNew{
    public static void main(String[] args) {
        String name1 = "India";
        String name2 = "India";
        String name3 = new String("India");

        System.out.println(name1 == name2);       //true
        System.out.println(name1 == name3);       //false
        System.out.println(name1.equals(name3));  //true
    }
}

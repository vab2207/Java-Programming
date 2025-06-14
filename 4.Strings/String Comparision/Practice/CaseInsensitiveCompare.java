public class CaseInsensitiveCompare{
    public static void main(String[] args){
        String word1 = "Laptop";
        String word2 = "laptop";
        System.out.println("Equal ignoring case? " + word1.equalsIgnoreCase(word2));
    }
}

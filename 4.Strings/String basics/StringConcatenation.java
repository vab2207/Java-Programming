public class StringConcatenation{
    public static void main(String[] args) {
        String first = "Core";
        String second = "Java";

        String comb1 = first + second;
        String comb2 = first.concat(second);

        System.out.println(comb1);
        System.out.println(comb2);
    }
}

public class StringBuilderReplaceReverse{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Great day..");

        sb.replace(5, 13, "Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

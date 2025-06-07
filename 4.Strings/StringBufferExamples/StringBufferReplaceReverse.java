public class StringBufferReplaceReverse{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Java is tough");

        sb.replace(8, 13, "fun");
        System.out.println(sb); //Java is fun

        sb.reverse();
        System.out.println(sb); //nuf si avaJ
    }
}

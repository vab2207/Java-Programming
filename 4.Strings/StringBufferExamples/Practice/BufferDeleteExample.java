public class BufferDeleteExample{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello Java");
        sb.delete(5, 10);
        System.out.println(sb);
    }
}

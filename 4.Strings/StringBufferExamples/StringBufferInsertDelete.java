public class StringBufferInsertDelete{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HappyDay");

        sb.insert(5, " Birth");
        System.out.println(sb); //Happy Birthday

        sb.delete(5, 11);
        System.out.println(sb); //HappyDay
    }
}

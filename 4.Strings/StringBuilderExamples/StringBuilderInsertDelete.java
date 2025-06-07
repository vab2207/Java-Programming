public class StringBuilderInsertDelete{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("GoodEvening");

        sb.insert(4, " Night");
        System.out.println(sb); 

        sb.delete(4, 10);
        System.out.println(sb); 
    }
}

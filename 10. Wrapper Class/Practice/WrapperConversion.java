public class WrapperConversion{
    public static void main(String[] args){
        int a = 50;
        Integer obj = Integer.valueOf(a);
        int b = obj.intValue();
        System.out.println(b);
    }
}

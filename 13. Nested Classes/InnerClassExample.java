public class InnerClassExample{
    class Inner{
        void show(){
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args){
        InnerClassExample outer = new InnerClassExample();
        InnerClassExample.Inner obj = outer.new Inner();
        obj.show();
    }
}

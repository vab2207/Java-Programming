public class CounterExample{
    static int count = 0;

    CounterExample(){
        count++;
        System.out.println("Object count: " + count);
    }

    public static void main(String[] args){
        new CounterExample();
        new CounterExample();
        new CounterExample();
    }
}

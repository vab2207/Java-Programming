class Animal{
    String type = "Animal";
}

public class SuperKeywordExample extends Animal{
    String type = "Dog";

    void show(){
        System.out.println(super.type);
        System.out.println(type);
    }

    public static void main(String[] args){
        SuperKeywordExample obj = new SuperKeywordExample();
        obj.show();
    }
}

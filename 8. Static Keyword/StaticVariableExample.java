public class StaticVariableExample{
    int id;
    String name;
    static String college = "NIT";

    StaticVariableExample(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args){
        StaticVariableExample s1 = new StaticVariableExample(1, "Ravi");
        StaticVariableExample s2 = new StaticVariableExample(2, "Priya");
        s1.display();
        s2.display();
    }
}

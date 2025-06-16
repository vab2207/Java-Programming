public class ThisKeywordExample {
    int id;
    String name;

    ThisKeywordExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ThisKeywordExample s = new ThisKeywordExample(101, "Ravi");
        s.display();
    }
}

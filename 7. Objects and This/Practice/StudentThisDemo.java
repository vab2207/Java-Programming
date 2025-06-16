public class StudentThisDemo{
    int roll;
    String name;

    StudentThisDemo(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    void show(){
        System.out.println("Roll: " + roll + ", Name: " + name);
    }

    public static void main(String[] args){
        StudentThisDemo s = new StudentThisDemo(1, "Aditya");
        s.show();
    }
}

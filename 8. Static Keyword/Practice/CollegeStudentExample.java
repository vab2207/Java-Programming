public class CollegeStudentExample{
    int id;
    String name;
    static String college = "IIT";

    CollegeStudentExample(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args){
        CollegeStudentExample s1 = new CollegeStudentExample(101, "Amit");
        CollegeStudentExample s2 = new CollegeStudentExample(102, "Sneha");
        s1.display();
        s2.display();
    }
}

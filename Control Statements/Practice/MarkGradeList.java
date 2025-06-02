public class MarkGradeList {
    public static void main(String[] args) {
        int[] marks = {95, 82, 67, 54, 39};
        for (int i = 0; i < marks.length; i++) {
            int m = marks[i];
            if (m >= 90)
                System.out.println("Student " + (i + 1) + ": Grade A");
            else if (m >= 75)
                System.out.println("Student " + (i + 1) + ": Grade B");
            else if (m >= 50)
                System.out.println("Student " + (i + 1) + ": Grade C");
            else
                System.out.println("Student " + (i + 1) + ": Fail");
        }
    }
}

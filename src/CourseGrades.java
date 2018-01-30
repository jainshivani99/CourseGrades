import java.util.Arrays;

public class CourseGrades {

    private int CRN;
    private String Subject;
    private int Number;
    private String Title;
    private String Section;
    private String Type;
    private int Term;
    private String Instructor;
    private int[] Grades;
    private double Average;

    public CourseGrades() {
    }

    public int getCRN() {
        return CRN;
    }

    public String getSubject() {
        return Subject;
    }

    public int getNumber() {
        return Number;
    }

    public String getTitle() {
        return Title;
    }

    public String getSection() {
        return Section;
    }

    public String getType() {
        return Type;
    }

    public int getTerm() {
        return Term;
    }

    public String getInstructor() {
        return Instructor;
    }

    public int[] getGrades() {
        return Grades;
    }

    public double getAverage() {
        return Average;
    }
}

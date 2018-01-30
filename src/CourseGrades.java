public class CourseGrades {

    private int CRN;
    private String subject;
    private int number;
    private String title;
    private String section;
    private String type;
    private int term;
    private String instructor;
    private int[] grades;
    private double average;

    public CourseGrades() {
    }

    public int getCRN() {
        return CRN;
    }

    public String getSubject() {
        return subject;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getType() {
        return type;
    }

    public int getTerm() {
        return term;
    }

    public String getInstructor() {
        return instructor;
    }

    public int[] getGrades() {
        return grades;
    }

    public double getAverage() {
        return average;
    }
}

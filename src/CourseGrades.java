public class CourseGrades {

    private static int CRN;
    private static String subject;
    private static int number;
    private static String title;
    private static String section;
    private static String type;
    private static int term;
    private static String instructor;
    private static int[] grades;
    private static double average;

    public CourseGrades() {
    }

    public static int getCRN() {
        return CRN;
    }

    public static String getSubject() {
        return subject;
    }

    public static int getNumber() {
        return number;
    }

    public static String getTitle() {
        return title;
    }

    public static String getSection() {
        return section;
    }

    public static String getType() {
        return type;
    }

    public static int getTerm() {
        return term;
    }

    public static String getInstructor() {
        return instructor;
    }

    public static int[] getGrades() {
        return grades;
    }

    public static double getAverage() {
        return average;
    }
}

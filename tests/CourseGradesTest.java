import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

/**A class that tests the functionality of a single course grade object from a JSON file */
public class CourseGradesTest {

    private static final String COURSE_JSON = "{ \"CRN\": 41758, \"Subject\": \"AAS\", \"Number\": 100, \"Title\": \"Intro Asian American Studies\", \"Section\": \"AD1\", \"Type\": \"DIS\", \"Term\": 120138, \"Instructor\": \"Arai, Sayuri\", \"Grades\": [6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0], \"Average\": 3.72 }";
    private CourseGrades myCourseGrades;

    //Instantiates a Gson object and parses from the Json file into the variable myCourseGrades
    @Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
    }

    //Test for the CRN variable
    @Test
    public void getCRN() {
        assertEquals(41758, myCourseGrades.getCRN());
    }

    //Test for the Subject variable
    @Test
    public void getSubject() {
        assertEquals("AAS", myCourseGrades.getSubject());
    }

    //Test for the Number variable
    @Test
    public void getNumber() {
        assertEquals(100, myCourseGrades.getNumber());
    }

    //Test for the Title variable
    @Test
    public void getTitle() {
        assertEquals("Intro Asian American Studies", myCourseGrades.getTitle());
    }

    //Test for the Section variable
    @Test
    public void getSection() {
        assertEquals("AD1", myCourseGrades.getSection());
    }

    //Test for the Type variable
    @Test
    public void getType() {
        assertEquals("DIS", myCourseGrades.getType());
    }

    //Test for the Term variable
    @Test
    public void getTerm() {
        assertEquals(120138, myCourseGrades.getTerm());
    }

    //Test for the Instructor variable
    @Test
    public void getInstructor() {
        assertEquals("Arai, Sayuri", myCourseGrades.getInstructor());
    }

    //Test for the Grades variable
    @Test
    public void getGrades() {
        int[] expectedResult = {6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean equals = Arrays.equals(expectedResult, myCourseGrades.getGrades());
        assertEquals(equals, true);
    }

    //Test for the Average variable
    @Test
    public void getAverage() {
        assertEquals(3.72, myCourseGrades.getAverage(), 0);
    }
}
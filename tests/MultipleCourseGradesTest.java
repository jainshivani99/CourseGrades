import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/**A test class that tests the functionality of multiple course grade objects that are subsequently stored in an array. */
public class MultipleCourseGradesTest {

    private static final String COURSE_JSON =  "[{ \"CRN\": 47100, \"Subject\": \"AAS\", \"Number\": 100, \"Title\": \"Intro Asian American Studies\", \"Section\": \"AD2\", \"Type\": \"DIS\", \"Term\": 120138, \"Instructor\": \"Arai, Sayuri\", \"Grades\": [6, 11, 4, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0], \"Average\": 3.64 },{ \"CRN\": 47102, \"Subject\": \"AAS\", \"Number\": 100, \"Title\": \"Intro Asian American Studies\", \"Section\": \"AD3\", \"Type\": \"DIS\", \"Term\": 120138, \"Instructor\": \"Davis, Thomas E\", \"Grades\": [2, 24, 1, 2, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0], \"Average\": 3.75 },{ \"CRN\": 51248, \"Subject\": \"AAS\", \"Number\": 100, \"Title\": \"Intro Asian American Studies\", \"Section\": \"AD4\", \"Type\": \"DIS\", \"Term\": 120138, \"Instructor\": \"Davis, Thomas E\", \"Grades\": [7, 16, 4, 4, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0], \"Average\": 3.71 }]";
    private CourseGrades[] myCourseGrades;

    //Instantiates a Gson object and parses from the Json file into the variable myCourseGrades
    @Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        myCourseGrades = gson.fromJson(COURSE_JSON, CourseGrades[].class);
    }

    //Tests CRN from the first course grade object
    @Test
    public void getCRNfromObject1() {
        assertEquals(47100, myCourseGrades[0].getCRN());
    }

    //Tests CRN from the second course grade object
    @Test
    public void getCRNfromObject2() {
        assertEquals(47102, myCourseGrades[1].getCRN());
    }

    //Tests CRN from the third course grade object
    @Test
    public void getCRNfromObject3() {
        assertEquals(51248, myCourseGrades[2].getCRN());
    }

    @Test
    public void getSubject() {
        assertEquals("AAS", myCourseGrades[0].getSubject());
        assertEquals("AAS", myCourseGrades[1].getSubject());
        assertEquals("AAS", myCourseGrades[2].getSubject());
    }

    @Test
    public void getNumber() {
        assertEquals(100, myCourseGrades[0].getNumber());
        assertEquals(100, myCourseGrades[1].getNumber());
        assertEquals(100, myCourseGrades[2].getNumber());
    }

    @Test
    public void getTitle() {
        assertEquals("Intro Asian American Studies", myCourseGrades[0].getTitle());
        assertEquals("Intro Asian American Studies", myCourseGrades[1].getTitle());
        assertEquals("Intro Asian American Studies", myCourseGrades[2].getTitle());
    }

    @Test
    public void getSection() {
        assertEquals("AD2", myCourseGrades[0].getSection());
        assertEquals("AD3", myCourseGrades[1].getSection());
        assertEquals("AD4", myCourseGrades[2].getSection());
    }

    @Test
    public void getType() {
        assertEquals("DIS", myCourseGrades[0].getType());
        assertEquals("DIS", myCourseGrades[1].getType());
        assertEquals("DIS", myCourseGrades[2].getType());
    }

    @Test
    public void getTerm() {
        assertEquals(120138, myCourseGrades[0].getTerm());
        assertEquals(120138, myCourseGrades[1].getTerm());
        assertEquals(120138, myCourseGrades[2].getTerm());
    }

    @Test
    public void getInstructor() {
        assertEquals("Arai, Sayuri", myCourseGrades[0].getInstructor());
        assertEquals("Davis, Thomas E", myCourseGrades[1].getInstructor());
        assertEquals("Davis, Thomas E", myCourseGrades[2].getInstructor());
    }

    @Test
    public void getGrades() {
        int[] expectedResult0 = {6, 11, 4, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult1 = {2, 24, 1, 2, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult2 = {7, 16, 4, 4, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0};
        boolean equals0 = Arrays.equals(expectedResult0, myCourseGrades[0].getGrades());
        boolean equals1 = Arrays.equals(expectedResult1, myCourseGrades[1].getGrades());
        boolean equals2 = Arrays.equals(expectedResult2, myCourseGrades[2].getGrades());
        assertEquals(equals0, true);
        assertEquals(equals1, true);
        assertEquals(equals2, true);
    }

    @Test
    public void getAverage() {
        assertEquals(3.64, myCourseGrades[0].getAverage(), 0);
        assertEquals(3.75, myCourseGrades[1].getAverage(), 0);
        assertEquals(3.71, myCourseGrades[2].getAverage(), 0);
    }
}

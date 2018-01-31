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

    //Tests Subject from the first course grade object
    @Test
    public void getSubjectFromObject1() {
        assertEquals("AAS", myCourseGrades[0].getSubject());
    }

    //Tests Subject from the second course grade object
    @Test
    public void getSubjectFromObject2() {
        assertEquals("AAS", myCourseGrades[1].getSubject());
    }

    //Tests Subject from the third course grade object
    @Test
    public void getSubjectFromObject3() {
        assertEquals("AAS", myCourseGrades[2].getSubject());
    }

    //Tests Number from the first course grade object
    @Test
    public void getNumberFromObject1() {
        assertEquals(100, myCourseGrades[0].getNumber());
    }

    //Tests Number from the second course grade object
    @Test
    public void getNumberFromObject2() {
        assertEquals(100, myCourseGrades[1].getNumber());
    }

    //Tests Number from the third course grade object
    @Test
    public void getNumberFromObject3() {
        assertEquals(100, myCourseGrades[2].getNumber());
    }

    //Tests Title from the first course grade object
    @Test
    public void getTitleFromObject1() {
        assertEquals("Intro Asian American Studies", myCourseGrades[0].getTitle());
    }

    //Tests Title from the second course grade object
    @Test
    public void getTitleFromObject2() {
        assertEquals("Intro Asian American Studies", myCourseGrades[1].getTitle());
    }

    //Tests Title from the third course grade object
    @Test
    public void getTitleFromObject3() {
        assertEquals("Intro Asian American Studies", myCourseGrades[2].getTitle());
    }

    //Tests Section from the first course grade object
    @Test
    public void getSectionFromObject1() {
        assertEquals("AD2", myCourseGrades[0].getSection());
    }

    //Tests Section from the second course grade object
    @Test
    public void getSectionFromObject2() {
        assertEquals("AD3", myCourseGrades[1].getSection());
    }

    //Tests Section from the third course grade object
    @Test
    public void getSectionFromObject3() {
        assertEquals("AD4", myCourseGrades[2].getSection());
    }

    //Tests Type from the first course grade object
    @Test
    public void getTypeFromObject1() {
        assertEquals("DIS", myCourseGrades[0].getType());
    }

    //Tests Type from the second course grade object
    @Test
    public void getTypeFromObject2() {
        assertEquals("DIS", myCourseGrades[1].getType());
    }

    //Tests Type from the third course grade object
    @Test
    public void getTypefromObject3() {
        assertEquals("DIS", myCourseGrades[2].getType());
    }

    //Tests Term from the first course grade object
    @Test
    public void getTermFromObject1() {
        assertEquals(120138, myCourseGrades[0].getTerm());
    }

    //Tests Term from the second course grade object
    @Test
    public void getTermFromObject2() {
        assertEquals(120138, myCourseGrades[1].getTerm());
    }

    //Tests Term from the third course grade object
    @Test
    public void getTermFromObject3() {
        assertEquals(120138, myCourseGrades[2].getTerm());
    }

    //Tests Instructor from the first course grade object
    @Test
    public void getInstructorFromObject1() {
        assertEquals("Arai, Sayuri", myCourseGrades[0].getInstructor());
    }

    //Tests Instructor from the second course grade object
    @Test
    public void getInstructorFromObject2() {
        assertEquals("Davis, Thomas E", myCourseGrades[1].getInstructor());
    }

    //Tests Instructor from the third course grade object
    @Test
    public void getInstructorFromObject3() {
        assertEquals("Davis, Thomas E", myCourseGrades[2].getInstructor());
    }

    //Tests Grades from the first course grade object
    @Test
    public void getGradesFromObject1() {
        int[] expectedResult0 = {6, 11, 4, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean equals0 = Arrays.equals(expectedResult0, myCourseGrades[0].getGrades());
        assertEquals(equals0, true);
    }

    //Tests Grades from the second course grade object
    @Test
    public void getGradesFromObject2() {
        int[] expectedResult1 = {2, 24, 1, 2, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        boolean equals1 = Arrays.equals(expectedResult1, myCourseGrades[1].getGrades());
        assertEquals(equals1, true);
    }

    //Tests Grades from the third course grade object
    @Test
    public void getGradesFromObject3() {
        int[] expectedResult2 = {7, 16, 4, 4, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0};
        boolean equals2 = Arrays.equals(expectedResult2, myCourseGrades[2].getGrades());
        assertEquals(equals2, true);
    }

    //Tests Average from the first course grade object
    @Test
    public void getAverageFromObject1() {
        assertEquals(3.64, myCourseGrades[0].getAverage(), 0);
    }

    //Tests Average from the second course grade object
    @Test
    public void getAverageFromObject2() {
        assertEquals(3.75, myCourseGrades[1].getAverage(), 0);
    }

    //Tests Average from the third course grade object
    @Test
    public void getAverageFromObject3() {
        assertEquals(3.71, myCourseGrades[2].getAverage(), 0);
    }
}

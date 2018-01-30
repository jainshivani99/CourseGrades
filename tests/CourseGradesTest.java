import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CourseGradesTest {

    private static final String COURSE_JSON = "{ \"CRN\": 41758, \"Subject\": \"AAS\", \"Number\": 100, \"Title\": \"Intro Asian American Studies\", \"Section\": \"AD1\", \"Type\": \"DIS\", \"Term\": 120138, \"Instructor\": \"Arai, Sayuri\", \"Grades\": [6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0], \"Average\": 3.72 }";
    private CourseGrades myCourseGrades;
    /**private static final String COURSE_ARRAY_JSON = "{CRN": 47100, "Subject": "AAS", "Number": 100, "Title":
            "Intro Asian American Studies", "Section": "AD2", "Type": "DIS", "Term": 120138, "Instructor": "Arai, Sayuri",
            "Grades": [6, 11, 4, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0], "Average": 3.64 },
        { "CRN": 47102, "Subject": "AAS", "Number": 100, "Title": "Intro Asian American Studies", "Section": "AD3",
        "Type": "DIS", "Term": 120138, "Instructor": "Davis, Thomas E", "Grades": [2, 24, 1, 2, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0],
        "Average": 3.75 }";*/

    @Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
    }

    @Test
    public void getCRN() {
        assertEquals(41758, myCourseGrades.getCRN());
    }

    @Test
    public void getSubject() {
        assertEquals("AAS", myCourseGrades.getSubject());
    }

    @Test
    public void getNumber() {
        assertEquals(100, myCourseGrades.getNumber());
    }

    @Test
    public void getTitle() {
        assertEquals("Intro Asian American Studies", myCourseGrades.getTitle());
    }

    @Test
    public void getSection() {
        assertEquals("AD1", myCourseGrades.getSection());
    }

    @Test
    public void getType() {
        assertEquals("DIS", myCourseGrades.getType());
    }

    @Test
    public void getTerm() {
        assertEquals(120138, myCourseGrades.getTerm());
    }

    @Test
    public void getInstructor() {
        assertEquals("Arai, Sayuri", myCourseGrades.getInstructor());
    }

    @Test
    public void getGrades() {
        int[] expectedResult = {6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean equals = Arrays.equals(expectedResult, myCourseGrades.getGrades());
        assertEquals(equals, true);
    }

    @Test
    public void getAverage() {
        assertEquals(3.72, myCourseGrades.getAverage(), 0);
    }
}
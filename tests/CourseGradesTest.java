import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CourseGradesTest {

    private static final String COURSE_JSON = "{ \"CRN\": 41758, \"Subject\": \"AAS\", \"Number\": 100, \"Title\": \"Intro Asian American Studies\", \"Section\": \"AD1\", \"Type\": \"DIS\", \"Term\": 120138, \"Instructor\": \"Arai, Sayuri\", \"Grades\": [6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0], \"Average\": 3.72 }";

    /**private static final String COURSE_ARRAY_JSON = "{CRN": 47100, "Subject": "AAS", "Number": 100, "Title":
            "Intro Asian American Studies", "Section": "AD2", "Type": "DIS", "Term": 120138, "Instructor": "Arai, Sayuri",
            "Grades": [6, 11, 4, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0], "Average": 3.64 },
        { "CRN": 47102, "Subject": "AAS", "Number": 100, "Title": "Intro Asian American Studies", "Section": "AD3",
        "Type": "DIS", "Term": 120138, "Instructor": "Davis, Thomas E", "Grades": [2, 24, 1, 2, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0],
        "Average": 3.75 }";*/

    /**@Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
    }*/

    @Test
    public void getCRN() {
        System.out.println(COURSE_JSON);
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals(41758, myCourseGrades.getCRN());
    }

    @Test
    public void getSubject() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("AAS", myCourseGrades.getSubject());
    }

    @Test
    public void getNumber() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals(100, myCourseGrades.getNumber());
    }

    @Test
    public void getTitle() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("Intro Asian American Studies", myCourseGrades.getTitle());
    }

    @Test
    public void getSection() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("AD1", myCourseGrades.getSection());
    }

    @Test
    public void getType() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("DIS", myCourseGrades.getType());
    }

    @Test
    public void getTerm() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals(120138, myCourseGrades.getTerm());
    }

    @Test
    public void getInstructor() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("Arai, Sayuri", myCourseGrades.getInstructor());
    }

    /**@Test
    public void getGrades() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals(Arrays.toString(6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0), CourseGrades.getGrades());
    }*/

    @Test
    public void getAverage() {
        Gson gson = new Gson();
        CourseGrades myCourseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals(3.72, myCourseGrades.getAverage());
    }
}
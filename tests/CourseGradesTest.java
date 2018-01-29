import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseGradesTest {

    private static final String COURSE_JSON = "{ \"CRN\": 41758, \"Subject\": \"AAS\", \"Number\": 100, \"Title\": " +
            "\"Intro Asian American Studies\", \"Section\": \"AD1\", \"Type\": \"DIS\", \"Term\": 120138, \"Instructor\"" +
            ": \"Arai, Sayuri\", \"Grades\": [6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0], \"Average\": 3.72 },";

    /**@Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
    }*/

    @Test
    public void getCRN() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("41758", courseGrades.getCRN());
    }

    @Test
    public void getSubject() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("AAS", courseGrades.getSubject());
    }

    @Test
    public void getNumber() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("100", courseGrades.getNumber());
    }

    @Test
    public void getTitle() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("Intro Asian American Studies", courseGrades.getTitle());
    }

    @Test
    public void getSection() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("AD1", courseGrades.getSection());
    }

    @Test
    public void getType() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("DIS", courseGrades.getType());
    }

    @Test
    public void getTerm() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("120138", courseGrades.getTerm());
    }

    @Test
    public void getInstructor() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("Arai, Sayuri", courseGrades.getInstructor());
    }

    @Test
    public void getGrades() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("[6, 16, 5, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0]", courseGrades.getGrades());
    }

    @Test
    public void getAverage() {
        Gson gson = new Gson();
        CourseGrades courseGrades = gson.fromJson(COURSE_JSON,CourseGrades.class);
        assertEquals("3.72", courseGrades.getAverage());
    }
}
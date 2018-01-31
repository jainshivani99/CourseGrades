import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class FilteringMethodsTest {

    private ArrayList<CourseGrades> myCourseGrades = new ArrayList<CourseGrades>();

    @Before
    public void setUp() throws Exception {
        String courseJson = Data.getFileContentsAsString("Fall2013");
        Gson gson = new Gson();
        CourseGrades currentCourse = gson.fromJson(courseJson, CourseGrades[].class);
        myCourseGrades.add(currentCourse);
    }

    @Test
    public void getCoursesFromSubject() {
        ArrayList<CourseGrades> expectedResult = {}
        assertEquals()
    }

    @Test
    public void getCoursesFromInstructor() {
        assertEquals()
    }

    @Test
    public void getCoursesFromNumber() {
        assertEquals()
    }

    @Test
    public void getCoursesFromStudents() {
        assertEquals()
    }

    @Test
    public void getCoursesFromType() {
        assertEquals()
    }

    @Test
    public void getCoursesFromSection() {
        assertEquals()
    }

}

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AggregationMethodsTest {

    private ArrayList<CourseGrades> myCourseGrades = new ArrayList<CourseGrades>();

    @Before
    public void setUp() throws Exception {
        String courseJson = Data.getFileContentsAsString("Fall2013");
        Gson gson = new Gson();
        CourseGrades currentCourse = gson.fromJson(courseJson, CourseGrades[].class);
        myCourseGrades.add(currentCourse);
    }

    @Test
    public void numStudentsInClasses() {
        assertEquals()
    }

    @Test
    public void numStudentsWithGrade() {
        assertEquals()
    }

    @Test
    public void gpaMeanByCourse() {
        assertEquals()
    }
}

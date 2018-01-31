import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AggregationMethodsTest {

    private static final String COURSE_JSON = Data.getFileContentsAsString("Fall2013Test.json");
    private ArrayList<CourseGrades> myCourseGrades = new ArrayList<CourseGrades>();

    @Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        CourseGrades courseObject = gson.fromJson(COURSE_JSON, CourseGrades.class);
        myCourseGrades.add(courseObject);
    }

/**    @Test
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
    }*/
}

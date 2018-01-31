import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/** A class that tests the functionality of the AggregationMethods class */
public class AggregationMethodsTest {

    private static final String COURSE_JSON = Data.getFileContentsAsString("Fall2013Test.json");
    private ArrayList<CourseGrades> myCourseGrades = new ArrayList<CourseGrades>();

    @Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        CourseGrades[] courseObject = gson.fromJson(COURSE_JSON, CourseGrades[].class);
        myCourseGrades = new ArrayList<CourseGrades>(Arrays.asList(courseObject));
    }

    //Tests for function numStudentsInClasses, Returns total number of students
    @Test
    public void testNumStudentsInClasses() {
        assertEquals(56, AggregationMethods.numStudentsInClasses(myCourseGrades));
    }

    //Tests for function numStudentsWithGrade, Returns total number of students
    @Test
    public void testNumStudentsWithGrade() {
        assertEquals(41, AggregationMethods.numStudentsWithGrade(myCourseGrades,0,6));
    }

    //Tests for function gpaMeanByCourse, Returns mean of weighted means
    @Test
    public void tesGpaMeanByCourse() {
        assertEquals(5.83, AggregationMethods.gpaMeanByCourse(myCourseGrades),0);
    }
}

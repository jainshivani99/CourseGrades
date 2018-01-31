import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/** A class that tests the functionality of the FilteringMethods class */
public class FilteringMethodsTest {

    private static final String COURSE_JSON = Data.getFileContentsAsString("Fall2013Test.json");
    private ArrayList<CourseGrades> myCourseGrades = new ArrayList<CourseGrades>();

    @Before
    public void setUp() throws Exception {
        Gson gson = new Gson();
        CourseGrades[] courseObject = gson.fromJson(COURSE_JSON, CourseGrades[].class);
        myCourseGrades = new ArrayList<CourseGrades>(Arrays.asList(courseObject));
    }

    //Tests an array list of course grade objects for the given subject
    @Test
    public void testGetCoursesFromSubject() {
        ArrayList<CourseGrades> expectedResult = new ArrayList<CourseGrades>();
        Collections.addAll(expectedResult, myCourseGrades.get(0), myCourseGrades.get(1));
        assertEquals(expectedResult, FilteringMethods.getCoursesFromSubject(myCourseGrades, "AAS"));
    }

    //Tests an array list of course grade objects for the given instructor
    @Test
    public void testGetCoursesFromInstructor() {
        ArrayList<CourseGrades> expectedResult = new ArrayList<CourseGrades>();
        Collections.addAll(expectedResult, myCourseGrades.get(0), myCourseGrades.get(1));
        assertEquals(expectedResult, FilteringMethods.getCoursesFromInstructor(myCourseGrades, "Arai, Sayuri"));
    }

    //Tests an array list of course grade objects for the given instructor fragment
    @Test
    public void testGetCoursesFromInstructorFragment() {
        ArrayList<CourseGrades> expectedResult = new ArrayList<CourseGrades>();
        Collections.addAll(expectedResult, myCourseGrades.get(0), myCourseGrades.get(1));
        assertEquals(expectedResult, FilteringMethods.getCoursesFromInstructor(myCourseGrades, "ayuri"));
    }

    //Tests an array list of course grade objects for the given range of course numbers
    @Test
    public void testGetCoursesFromNumber() {
        ArrayList<CourseGrades> expectedResult = new ArrayList<CourseGrades>();
        Collections.addAll(expectedResult, myCourseGrades.get(0), myCourseGrades.get(1), myCourseGrades.get(3));
        assertEquals(expectedResult, FilteringMethods.getCoursesFromNumber(myCourseGrades, 100,200));
    }

    //Tests an array list of course grade objects for the given range of students
    @Test
    public void testGetCoursesFromStudents() {
        ArrayList<CourseGrades> expectedResult = new ArrayList<CourseGrades>();
        Collections.addAll(expectedResult, myCourseGrades.get(0), myCourseGrades.get(1) ,myCourseGrades.get(2),myCourseGrades.get(3));
        assertEquals(expectedResult, FilteringMethods.getCoursesFromStudents(myCourseGrades, 2, 15));
    }

    //Tests an array list of course grade objects for the given type
    @Test
    public void testGetCoursesFromType() {
        ArrayList<CourseGrades> expectedResult = new ArrayList<CourseGrades>();
        Collections.addAll(expectedResult, myCourseGrades.get(2), myCourseGrades.get(3));
        assertEquals(expectedResult, FilteringMethods.getCoursesFromType(myCourseGrades, "LCD"));
    }

    //Tests an array list of course grade objects for the given section
    @Test
    public void testGetCoursesFromSection() {
        ArrayList<CourseGrades> expectedResult = new ArrayList<CourseGrades>();
        Collections.addAll(expectedResult, myCourseGrades.get(1));
        assertEquals(expectedResult, FilteringMethods.getCoursesFromSection(myCourseGrades, "AD2"));
    }

}

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayCourseGradesTest {

    private CourseGrades[] myCourseGrades;
    private static final String COURSE_JSON = Data.getFileContentsAsString("Fall2013.json");
    
    @Before
    public void setUp() throws Exception {
        //Convert a Json file to a String by using the getFileContentsAsString() method from the Data class
        //String courseJson = Data.getFileContentsAsString("Fall2013.json");
        //Make a Gson object and set up a array of course grades objects
        Gson gson = new Gson();
        //Parse a single Json file into an array of course grades objects
        myCourseGrades = gson.fromJson(COURSE_JSON, CourseGrades[].class);
    }

    @Test
    public void getCRN() {
        assertEquals(41758, myCourseGrades[0].getCRN());
    }

    @Test
    public void getSubject() {
        assertEquals("AAS", this.myCourseGrades[0].getSubject());
    }

    //Use a similar process for several Json files (use a method and call it several times in a loop), returns an array of course grade objects


}

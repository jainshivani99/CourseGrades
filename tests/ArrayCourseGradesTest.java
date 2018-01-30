import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayCourseGradesTest {

    private ArrayList<CourseGrades[]> myCourseGrades = new ArrayList<CourseGrades[]>();

    @Before
    public void setUp() throws Exception {
        List<String> jsonFiles = Data.getJsonFilesAsList();
        for (int index = 0; index < jsonFiles.size(); index++) {
            //Convert a Json file to a String by using the getFileContentsAsString() method from the Data class
            String courseJson = Data.getFileContentsAsString(jsonFiles.get(index));
            //Make a Gson object and set up a array of course grades objects
            Gson gson = new Gson();
            //Parse a single Json file into an array of course grades objects
            CourseGrades[] courseObjects = gson.fromJson(courseJson, CourseGrades[].class);
            myCourseGrades.add(courseObjects);
        }
    }

    @Test
    public void getCRN() {
        assertEquals(41758, myCourseGrades.get(0)[0].getCRN());
    }

    @Test
    public void getSubject() {
        assertEquals("AAS", myCourseGrades.get(0)[0].getSubject());
    }

    //Use a similar process for several Json files (use a method and call it several times in a loop), returns an array of course grade objects

}

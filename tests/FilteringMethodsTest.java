import java.util.ArrayList;

public class FilteringMethodsTest {

    //Returns an array list of all courses that fit a certain
    public ArrayList<CourseGrades> getCoursesFromSubject(ArrayList<CourseGrades> myCourseGrades, String subject) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getSubject().equals(subject)){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //what about a fragment of the instructor's name
    public ArrayList<CourseGrades> getCoursesFromInstructor(ArrayList<CourseGrades> myCourseGrades, String instructor) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getInstructor().equals(instructor)){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //how to use a range, won't use .equals()
    public ArrayList<CourseGrades> getCoursesFromNumber(ArrayList<CourseGrades> myCourseGrades, int range) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getNumber() == range){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //what attribute represents number of students, won't use .equals()
    public ArrayList<CourseGrades> getCoursesFromStudents(int students) {
        return null;
    }

    public ArrayList<CourseGrades> getCoursesFromType(ArrayList<CourseGrades> myCourseGrades, String type) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getType().equals(type)){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    public ArrayList<CourseGrades> getCoursesFromSection(ArrayList<CourseGrades> myCourseGrades, String section) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getSection().equals(section)){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }
}

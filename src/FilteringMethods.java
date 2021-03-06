import java.util.ArrayList;

//A class that includes all the filtering methods that filter out course grade objects that match a certain criteria
public class FilteringMethods {

    //Returns an array list of all courses that fit a given subject
    public static ArrayList<CourseGrades> getCoursesFromSubject(ArrayList<CourseGrades> myCourseGrades, String subject) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getSubject().equals(subject)){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //Returns an array list of courses whose instructor matches the given instructor name or fragment of name
    public static ArrayList<CourseGrades> getCoursesFromInstructor(ArrayList<CourseGrades> myCourseGrades, String instructor) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getInstructor().contains(instructor)){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //Returns an array list of courses whose course number is within a certain range
    public static ArrayList<CourseGrades> getCoursesFromNumber(ArrayList<CourseGrades> myCourseGrades, int low, int high) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getNumber() >= low && currentCourse.getNumber() <= high){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //Returns an array list of courses whose number of students in within a certain range
    //Assumption: Each element in a the grades array of a course object represents one student's grade, therefor the length of the array is the total number of students in the course
    public static ArrayList<CourseGrades> getCoursesFromStudents(ArrayList<CourseGrades> myCourseGrades, int low, int high) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if ((currentCourse.getGrades()).length >= low && (currentCourse.getGrades()).length <= high){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //Returns an array list of courses that contain the given type
    public static ArrayList<CourseGrades> getCoursesFromType(ArrayList<CourseGrades> myCourseGrades, String type) {
        ArrayList<CourseGrades> desiredCourseGrades = new ArrayList<CourseGrades>();
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            if (currentCourse.getType().equals(type)){
                desiredCourseGrades.add(currentCourse);
            }
        }
        return desiredCourseGrades;
    }

    //Returns an array list of courses that contain the given section
    public static ArrayList<CourseGrades> getCoursesFromSection(ArrayList<CourseGrades> myCourseGrades, String section) {
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
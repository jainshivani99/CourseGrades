import java.util.ArrayList;

//A class that includes all the aggregation methods that aggregate the data across a collection of courses
public class AggregationMethods {

    //Returns the total number of students in a a given array list of classes
    public static int numStudentsInClasses(ArrayList<CourseGrades> myCourseGrades) {
        int totalStudents = 0;
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            totalStudents += currentCourse.getGrades().length;
        }
        return totalStudents;
    }

    //Returns the total number of students that have a grade in a certain range of grades provided
    //Implementation: Keep grade ranges as numbers
    public static int numStudentsWithGrade(ArrayList<CourseGrades> myCourseGrades, int low, int high) {
        int totalStudents = 0;
        for (int courseIndex = 0; courseIndex < myCourseGrades.size(); courseIndex++) {
            CourseGrades currentCourse = myCourseGrades.get(courseIndex);
            int[] currentCourseGrades = currentCourse.getGrades();
            for (int gradesIndex = 0; gradesIndex < currentCourseGrades.length; gradesIndex++) {
                if (currentCourseGrades[gradesIndex] >= low && currentCourseGrades[gradesIndex] <= high) {
                    totalStudents++;
                }
            }

        }
        return totalStudents;
    }

    //Returns a mean of the course GPA averages weighted by course enrollment
    public static double gpaMeanByCourse(ArrayList<CourseGrades> myCourseGrades) {
        double weightedMeanOfCourse = 0;
        double totalMean = 0;
        for (int index = 0; index < myCourseGrades.size(); index++) {
            CourseGrades currentCourse = myCourseGrades.get(index);
            int[] currentCourseGrades = currentCourse.getGrades();
            for (int gradesIndex = 0; gradesIndex < currentCourseGrades.length; gradesIndex++) {
                weightedMeanOfCourse += currentCourseGrades[gradesIndex] * (1.0/currentCourseGrades.length);
            }
            totalMean += weightedMeanOfCourse;
        }
        totalMean = totalMean / myCourseGrades.size();
        return totalMean;
    }
}

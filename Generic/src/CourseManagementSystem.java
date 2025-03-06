import java.util.ArrayList;
import java.util.List;


abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public abstract void evaluate();
}

// Specific Course Types
class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by exams.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by research work.");
    }
}

// Generic Course Manager
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public void listCourses() {
        for (T course : courses) {
            System.out.println("Course: " + course.getCourseName() + ", Instructor: " + course.getInstructor());
            course.evaluate();
        }
    }
}

// University Course Management System
class University {
    public static void printAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName() + ", Instructor: " + course.getInstructor());
            course.evaluate();
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math 101", "Dr. Smith"));
        examCourses.addCourse(new ExamCourse("Physics 201", "Dr. Brown"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("History 101", "Prof. Green"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research", "Dr. White"));

        System.out.println("--- Exam Courses ---");
        examCourses.listCourses();

        System.out.println("--- Assignment Courses ---");
        assignmentCourses.listCourses();

        System.out.println("--- Research Courses ---");
        researchCourses.listCourses();
    }
}


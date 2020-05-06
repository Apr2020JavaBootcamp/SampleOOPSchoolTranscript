import java.util.ArrayList;
import java.util.Scanner;

public class SchoolApp {
    public static void main(String args[]) {
        Student student = new Student();
        Course course;

        Scanner keybd = new Scanner(System.in);
        String name, courseName, grade;
        double gpa;
        int totalCredits, noCourses, courseCredit;

        System.out.println("Enter a student's name ");
        name = keybd.nextLine();
        student.setName(name);

        System.out.println("How many courses did take?");
        noCourses = keybd.nextInt();
        keybd.nextLine();

        totalCredits = 0;
        ArrayList<Course> allCourse = new ArrayList<>();

        for (int index = 1; index <= noCourses; index++) {
            course = new Course();
            System.out.println("Enter a course name ");
            courseName = keybd.nextLine();

            System.out.println("Enter a course grade ");
            grade = keybd.nextLine();

            System.out.println("Enter a credit for this course ");
            courseCredit = keybd.nextInt();
            keybd.nextLine();

            //need to convert grade into gpa
            course.setName(courseName);
            course.setGrade(grade);
            course.setCredits(courseCredit);

            allCourse.add(course);

        }

        student.setCourses(allCourse);

        System.out.println("*************************");
        System.out.println(student.toString());


    }
}

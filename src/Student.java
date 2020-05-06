import java.util.ArrayList;

public class Student {
    private String name;
    private double gpa;
    private int totalCredits;
    private ArrayList<Course> courses;
    private ArrayList<Address> addresses;

    public Student() {
        courses = new ArrayList<>();
        addresses = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        if (this.courses.size() <=0 ){
            this.courses = new ArrayList<>();
        }
        this.courses.add(course);
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address){
        this.addresses.add(address);
    }

    public String toString() {
        String retval = "Student Name: " + getName() + "\nTotal GPA: " + getGpa()
                + "\nTotal Credits: " + getTotalCredits() + "\n";

        for (Course course : getCourses()) {
            retval += course.toString();
        }

        return retval;
    }
}

public class Course {
    private String name;
    private int credits;
    private String grade;

    public Course() {
    }

    public Course(String name, int credits, String grade) {
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
//        String retval2 = "Name: " + getName() + "\tCredit: " + getCredits()
//                        + "\tGrade: " + getGrade() + "\n";

        String retval = "Name: " + name + "\tCredit: " + this.credits + "\tGrade: " + this.grade + "\n";

        return retval;
    }
}

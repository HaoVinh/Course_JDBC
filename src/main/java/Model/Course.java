package Model;

public class Course {

    private int courseID, departmentID, credits;
    String title;

    public Course() {

    }

    public Course(int courseID, int departmentID, String title, int credits) {
        this.courseID = courseID;
        this.departmentID = departmentID;
        this.title = title;
        this.credits = credits;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}

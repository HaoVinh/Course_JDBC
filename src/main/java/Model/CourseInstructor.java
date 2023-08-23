
package Model;

public class CourseInstructor {
   int personID , courseID;
   public CourseInstructor(){
       
   }

    public CourseInstructor(int personID, int courseID) {
        this.personID = personID;
        this.courseID = courseID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CourseInstructorDAL;
import Model.CourseInstructor;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseInstructorBLL {

    private CourseInstructorDAL ciDAL;

    public CourseInstructorBLL() {
        ciDAL = new CourseInstructorDAL();
    }

    public ArrayList<CourseInstructor> readCourseInstructor() {
        return ciDAL.readCourseInstructor();
    }

    public int insertCourseInstructor(CourseInstructor ci) throws SQLException {
        int result = ciDAL.insertCourseInstructor(ci);
        return result;
    }

    public int updateCourseInstructor(CourseInstructor ci) throws SQLException {
        int result = ciDAL.updateCourseInstructor(ci);
        return result;
    }

    public int deleteCourseInstructor(int courseID) throws SQLException {
        int result = ciDAL.deleteCourseInstructor(courseID);
        return result;
    }

    public ArrayList<CourseInstructor> findCIByCourseID(int courseID) {
        return ciDAL.findCIByCourseID(courseID);
    }

    public ArrayList<CourseInstructor> findCIByPersonID(int personID) {
        return ciDAL.findCIByPersonID(personID);
    }
}

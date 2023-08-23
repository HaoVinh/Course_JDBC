/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.CourseInstructor;
import Model.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author VU
 */
public class CourseInstructorDAL {

    Connection connection = SQLConnection.getConnection();

    public int insertCourseInstructor(CourseInstructor oi) throws SQLException {
        String query = "Insert CourseInstructor(CourseID , PersonID) VALUES(?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, oi.getCourseID());
        ps.setInt(2, oi.getPersonID());
        int result = ps.executeUpdate();
       return result;
    }

    public ArrayList readCourseInstructor() {
        ArrayList<CourseInstructor> olcourse = new ArrayList<>();

        try {
            String query = "SELECT * FROM CourseInstructor";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    CourseInstructor ci = new CourseInstructor();
                    ci.setCourseID(rs.getInt("CourseID"));
                    ci.setPersonID(rs.getInt("PersonID"));
                    olcourse.add(ci);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return olcourse;
    }

    public int deleteCourseInstructor(int courseID) throws SQLException {
        String query = "DELETE FROM CourseInstructor WHERE CourseID=?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, courseID);
        int result = ps.executeUpdate();
        return result;
    }

    public int updateCourseInstructor(CourseInstructor ci) throws SQLException {
        String query = "Update CourseInstructor Set PersonID = ? WHERE CourseID = ?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, ci.getPersonID());
        ps.setInt(2, ci.getCourseID());
        int result = ps.executeUpdate();
        return result;
    }

   

    public ArrayList<CourseInstructor> findCIByCourseID(int courseID) {
        ArrayList<CourseInstructor> olcourseList = new ArrayList<>();
        try {
            String query = "SELECT * FROM CourseInstructor WHERE CourseID LIKE ?";
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, String.valueOf(courseID));
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    CourseInstructor ci = new CourseInstructor();
                    ci.setCourseID(rs.getInt("CourseID"));
                    ci.setPersonID(rs.getInt("PersonID"));

                    olcourseList.add(ci);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return olcourseList;
    }

    public ArrayList<CourseInstructor> findCIByPersonID(int PersonID) {
        ArrayList<CourseInstructor> olcourseList = new ArrayList<>();
        try {
            String query = "SELECT * FROM CourseInstructor WHERE PersonID LIKE ?";
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, String.valueOf(PersonID));
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    CourseInstructor ci = new CourseInstructor();
                    ci.setCourseID(rs.getInt("CourseID"));
                    ci.setPersonID(rs.getInt("PersonID"));
                    olcourseList.add(ci);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return olcourseList;
    }

}

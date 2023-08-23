/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Course;
import Model.SQLConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class CourseDAL extends SQLConnection {
    Connection connection = SQLConnection.getConnection();
    
    public ArrayList readCourse(){
        ArrayList<Course> courseList=new ArrayList<>();
        try {
            String query = "SELECT * FROM Course";
            PreparedStatement ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    Course cs = new Course();
                    cs.setCourseID(rs.getInt("CourseID"));
                    cs.setTitle(rs.getString("Title"));
                    cs.setCredits(rs.getInt("Credits"));
                    cs.setDepartmentID(rs.getInt("DepartmentID"));
                    courseList.add(cs);
                }
            }

        } catch (Exception er) {
            er.printStackTrace();
        }
        return courseList;
    }
    public int deleteCourse(int courseID) throws SQLException{
        String query = "DELETE FROM Course WHERE CourseID=?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, courseID);
        int result = ps.executeUpdate();
        return result;
    }
    public int updateCourse (Course c) throws SQLException{
        String query = "UPDATE Course SET Title = ? , Credits = ? , DepartmentID = ? WHERE CourseID = ?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setString(1, c.getTitle());
        ps.setInt(2, c.getCredits());
        ps.setInt(3, c.getDepartmentID());
        ps.setInt(4, c.getCourseID());
        int result = ps.executeUpdate();
        return result;
    }
    public int insertCourse(Course c) throws SQLException{
        String query = "Insert Course(Title , Credits , DepartmentID) VALUES(?,?,?)";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setString(1, c.getTitle());
        ps.setInt(2, c.getCredits());
        ps.setInt(3, c.getDepartmentID());
        int result = ps.executeUpdate();
        return result;
    }
    public ArrayList<Course> findCourseByID(int courseID){
      ArrayList<Course> courseList = new ArrayList<>();
    try{
     String query = "SELECT * FROM Course WHERE CourseID LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1,String.valueOf(courseID));
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    Course cs = new Course();
                    cs.setCourseID(rs.getInt("CourseID"));
                    cs.setTitle(rs.getString("Title"));
                    cs.setCredits(rs.getInt("Credits"));
                    cs.setDepartmentID(rs.getInt("DepartmentID"));
                    courseList.add(cs);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return courseList;
}
     public ArrayList<Course> findCourseByTitle(String title){
      ArrayList<Course> courseList = new ArrayList<>();
    try{
     String query = "SELECT * FROM Course WHERE Title LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1, "%" + title +"%");
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    Course cs = new Course();
                    cs.setCourseID(rs.getInt("CourseID"));
                    cs.setTitle(rs.getString("Title"));
                    cs.setCredits(rs.getInt("Credits"));
                    cs.setDepartmentID(rs.getInt("DepartmentID"));
                    courseList.add(cs);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return courseList;
}
    
    
//    public static void main(String[] args) {
//        CourseDAL courseDAL=new CourseDAL();
//        ArrayList<Course> testList=courseDAL.readCourse();
//        System.out.println(testList.size());
//    }
 
}

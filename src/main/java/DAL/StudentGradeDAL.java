/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.StudentGrade;
import Model.SQLConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentGradeDAL {
    Connection connection = SQLConnection.getConnection();
    
    public ArrayList readGrade(){
        ArrayList<StudentGrade> gradeList=new ArrayList<>();
        try {
            String query = "SELECT * FROM StudentGrade";
            PreparedStatement ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    StudentGrade sg = new StudentGrade();
                    sg.setEnrollmentID(rs.getInt("EnrollmentID"));
                    sg.setCourseID(rs.getInt("CourseID"));
                    sg.setStudentID(rs.getInt("StudentID"));
                    sg.setGrade(rs.getFloat("Grade"));
                    gradeList.add(sg);
                }
            }

        } catch (Exception er) {
            er.printStackTrace();
        }
        return gradeList;
    }
    public int deleteGrade(int enrollmentID) throws SQLException{
        String query = "DELETE FROM StudentGrade WHERE EnrollmentID=?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, enrollmentID);
        int result = ps.executeUpdate();
        return result;
    }
    public int updateGrade (StudentGrade sg) throws SQLException{
        String query = "UPDATE StudentGrade SET CourseID = ? , StudentID = ?  ,Grade = ?"
                + " WHERE EnrollmentID = ?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, sg.getCourseID());
        ps.setInt(2, sg.getStudentID());
        ps.setFloat(3, sg.getGrade());
        ps.setInt(4, sg.getEnrollmentID());
        int result = ps.executeUpdate();
        return result;
    }
    public int insertGrade(StudentGrade sg) throws SQLException{
        String query = "Insert StudentGrade(CourseID, StudentID , Grade) VALUES(?,?,?)";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, sg.getCourseID());
        ps.setInt(2, sg.getStudentID());
        ps.setFloat(3, sg.getGrade());
        int result = ps.executeUpdate();
        return result;
    }
    public ArrayList<StudentGrade> findGradeByID(int enrollmentID){
      ArrayList<StudentGrade> gradeList = new ArrayList<>();
    try{
     String query = "SELECT * FROM StudentGrade WHERE EnrollmentID LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1,String.valueOf(enrollmentID));
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    StudentGrade sg = new StudentGrade();
                    sg.setEnrollmentID(rs.getInt("EnrollmentID"));
                    sg.setCourseID(rs.getInt("CourseID"));
                    sg.setStudentID(rs.getInt("StudentID"));
                    sg.setGrade(rs.getFloat("Grade"));
                    gradeList.add(sg);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return gradeList;
}
     public ArrayList<StudentGrade> findStudentIDBySID(int studentID){
      ArrayList<StudentGrade> gradeList = new ArrayList<>();
    try{
     String query = "SELECT * FROM StudentGrade WHERE StudentID LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1, String.valueOf(studentID));
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    StudentGrade sg = new StudentGrade();
                    sg.setEnrollmentID(rs.getInt("EnrollmentID"));
                    sg.setCourseID(rs.getInt("CourseID"));
                    sg.setStudentID(rs.getInt("StudentID"));
                    sg.setGrade(rs.getFloat("Grade"));
                    gradeList.add(sg);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return gradeList;
}
     public static void main(String[] args) {
        StudentGradeDAL sgDAL=new StudentGradeDAL();
        ArrayList<StudentGrade> testList=sgDAL.readGrade();
       System.out.println(testList.size());
    }
}
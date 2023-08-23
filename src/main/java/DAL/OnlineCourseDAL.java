/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.OnlineCourse;
import Model.SQLConnection;
import java.sql.*;
import java.util.ArrayList;
public class OnlineCourseDAL extends SQLConnection{
    Connection connection = SQLConnection.getConnection();
public ArrayList readOnlineCourse(){
    ArrayList<OnlineCourse> olcourse = new ArrayList<>();
    
    try{
         String query = "SELECT * FROM OnlineCourse";
            PreparedStatement ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
         if(rs!=null){
            int i = 1;
            
            while(rs.next()){
                OnlineCourse oc = new OnlineCourse();
                oc.setCourseID(rs.getInt("CourseID"));
                oc.setURL(rs.getString("url"));
                olcourse.add(oc);
            }
        }

    }catch(Exception ex){
        ex.printStackTrace();
    }
    return olcourse;
}
public int deleteOnlineCourse(int courseID) throws SQLException{
        String query = "DELETE FROM OnlineCourse WHERE CourseID=?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, courseID);
        int result = ps.executeUpdate();
        return result;
    }
    public int updateOnlineCourse (OnlineCourse oc) throws SQLException{
        String query = "Update OnlineCourse Set url = ? WHERE CourseID = ?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setString(1, oc.getURL());
        ps.setInt(2,oc.getCourseID());
        int result = ps.executeUpdate();
        return result;
    }
    public int insertOnlineCourse(OnlineCourse oc) throws SQLException{
        String query = "Insert OnlineCourse(CourseID , url) VALUES(?,?)";
         PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1,oc.getCourseID());
        ps.setString(2, oc.getURL());
        int result = ps.executeUpdate();
        return result;
    }
     public ArrayList<OnlineCourse> findOLCourseByID(int courseID){
      ArrayList<OnlineCourse> olcourseList = new ArrayList<>();
    try{
     String query = "SELECT * FROM OnlineCourse WHERE CourseID LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1,String.valueOf(courseID));
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    OnlineCourse oc = new OnlineCourse();
                    oc.setCourseID(rs.getInt("CourseID"));
                    oc.setURL(rs.getString("url"));
         
                    olcourseList.add(oc);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return olcourseList;
}
     public ArrayList<OnlineCourse> findOLCourseByURL(String url){
      ArrayList<OnlineCourse> olcourseList = new ArrayList<>();
    try{
     String query = "SELECT * FROM OnlineCourse WHERE url LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1, "%" + url +"%");
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    OnlineCourse oc = new OnlineCourse();
                    oc.setCourseID(rs.getInt("CourseID"));
                    oc.setURL(rs.getString("url"));
                    olcourseList.add(oc);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return olcourseList;
}
    
}

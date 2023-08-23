/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.OnsiteCourse;
import Model.SQLConnection;
import java.sql.*;
import java.util.ArrayList;
public class OnsiteCourseDAL extends SQLConnection {
    Connection connection = SQLConnection.getConnection();
public ArrayList readOnsiteCourse(){
    ArrayList<OnsiteCourse> oscourse = new ArrayList<>();
   try{
    String query = "SELECT * FROM OnsiteCourse";
       PreparedStatement ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
         if(rs!=null){
            int i = 1;
            
            while(rs.next()){
                OnsiteCourse osc = new OnsiteCourse();
                osc.setCourseID(rs.getInt("CourseID"));
                osc.setLocation(rs.getString("Location"));
                osc.setDays(rs.getString("Days"));
                osc.setTime(Time.valueOf(rs.getString("Time")));
                oscourse.add(osc);
            }
        }

   }catch(Exception ex){
   }
           return oscourse;
}
public int deleteOnsiteCourse(int courseID) throws SQLException{
        String query = "DELETE FROM OnsiteCourse WHERE CourseID=?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, courseID);
        int result = ps.executeUpdate();
        return result;
    }
    public int updateOnsiteCourse (OnsiteCourse osc) throws SQLException{
        String query = "UPDATE OnsiteCourse SET Location = ? , Days = ?, Time = ? WHERE CourseID = ?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setString(1, osc.getLocation());
        ps.setString(2, osc.getDays());
        ps.setTime(3, osc.getTime());
        ps.setInt(4, osc.getCourseID());
        int result = ps.executeUpdate();
        return result;
    }
    public int insertOnsiteCourse(OnsiteCourse osc) throws SQLException{
        String query = "Insert OnsiteCourse(CourseID , Location , Days , Time) VALUES(?,?,?,?)";
         PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1,osc.getCourseID());
        ps.setString(2, osc.getLocation());
        ps.setString(3, osc.getDays());
        ps.setTime(4, osc.getTime());
        int result = ps.executeUpdate();
        return result;
    }
    public ArrayList<OnsiteCourse> findOSCourseByID(int courseID){
      ArrayList<OnsiteCourse> oscourseList = new ArrayList<>();
    try{
     String query = "SELECT * FROM OnsiteCourse WHERE CourseID LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1,String.valueOf(courseID));
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    OnsiteCourse osc = new OnsiteCourse();
                    osc.setCourseID(rs.getInt("CourseID"));
                    osc.setLocation(rs.getString("Location"));
                    osc.setDays(rs.getString("Days"));
                    osc.setTime(Time.valueOf(rs.getString("Time")));
                    oscourseList.add(osc);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return oscourseList;
}
     public ArrayList<OnsiteCourse> findOSCourseByLocation(String location){
      ArrayList<OnsiteCourse> oscourseList = new ArrayList<>();
    try{
     String query = "SELECT * FROM OnsiteCourse WHERE Location LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1, "%" + location +"%");
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    OnsiteCourse osc = new OnsiteCourse();
                    osc.setCourseID(rs.getInt("CourseID"));
                    osc.setLocation(rs.getString("Location"));
                    osc.setDays(rs.getString("Days"));
                    osc.setTime(Time.valueOf(rs.getString("Time")));
                    oscourseList.add(osc);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return oscourseList;
}
     public static void main(String[] args) {
        OnsiteCourseDAL oscourseDAL=new OnsiteCourseDAL();
  ArrayList<OnsiteCourse> testList=oscourseDAL.readOnsiteCourse();
        System.out.println(testList.size());
    }
}

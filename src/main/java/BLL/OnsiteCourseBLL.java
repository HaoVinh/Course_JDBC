/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import Model.OnsiteCourse;
import DAL.OnsiteCourseDAL;
import java.sql.SQLException;
import java.util.ArrayList;
public class OnsiteCourseBLL {
     private OnsiteCourseDAL oscDAL;
    public OnsiteCourseBLL(){
    oscDAL = new OnsiteCourseDAL();
}
    public ArrayList<OnsiteCourse> readOnsiteCourse(){
        return oscDAL.readOnsiteCourse();
    }
    public int insertOnsiteCourse(OnsiteCourse osc) throws SQLException{
        int result = oscDAL.insertOnsiteCourse(osc);
        return result;
    }
    public int updateOnsiteCourse(OnsiteCourse osc) throws SQLException{
        int result = oscDAL.updateOnsiteCourse(osc);
        return result;
    }
    public int deleteOnsiteCourse(int courseID) throws SQLException{
        int result = oscDAL.deleteOnsiteCourse(courseID);
        return result;
    }
     public ArrayList<OnsiteCourse> findOnsiteCourseByID(int courseID){
       return oscDAL.findOSCourseByID(courseID);
    }
    public ArrayList<OnsiteCourse> findOnsiteCourseByLocation(String location){
       return oscDAL.findOSCourseByLocation(location);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import Model.OnlineCourse;
import DAL.OnlineCourseDAL;
import java.sql.SQLException;
import java.util.ArrayList;
public class OnlineCourseBLL {
    private OnlineCourseDAL olDAL;
        public OnlineCourseBLL(){
    olDAL = new OnlineCourseDAL();
}
    public ArrayList<OnlineCourse> readOnlineCourse(){
        return olDAL.readOnlineCourse();
    }
    public int insertOnlineCourse(OnlineCourse oc) throws SQLException{
        int result = olDAL.insertOnlineCourse(oc);
        return result;
    }
    public int updateOnlineCourse(OnlineCourse oc) throws SQLException{
        int result = olDAL.updateOnlineCourse(oc);
        return result;
    }
    public int deleteOnlineCourse(int courseID) throws SQLException{
        int result = olDAL.deleteOnlineCourse(courseID);
        return result;
    }
       public ArrayList<OnlineCourse> findOLCourseByID(int courseID){
       return olDAL.findOLCourseByID(courseID);
    }
    public ArrayList<OnlineCourse> findOLCourseByURL(String url){
       return olDAL.findOLCourseByURL(url);
    }
}

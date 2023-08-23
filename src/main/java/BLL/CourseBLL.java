/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import Model.Course;
import DAL.CourseDAL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CourseBLL {
    private CourseDAL courseDAL;
    public CourseBLL()
    {
        courseDAL = new CourseDAL();
    }
    public List loadCourse(int page) throws SQLException{
        int numofRecords = 30;
        ArrayList list = courseDAL.readCourse();
        int size = list.size();
        int from , to;
        from = (page - 1 )* numofRecords;
        to = page * numofRecords;
        
        return list.subList(from, Math.min(to, size));
    }
    public ArrayList<Course> readCourse(){
        return courseDAL.readCourse();
    }
    public int insertCourse(Course c) throws SQLException{
        int result = courseDAL.insertCourse(c);
        return result;
    }
    public int updateCourse(Course c) throws SQLException{
        int result = courseDAL.updateCourse(c);
        return result;
    }
    public int deleteCourse(int courseID) throws SQLException{
        int result = courseDAL.deleteCourse(courseID);
        return result;
    }
    public ArrayList<Course> findCourseByID(int courseID){
       return courseDAL.findCourseByID(courseID);
    }
    public ArrayList<Course> findCourseByTitle(String title){
       return courseDAL.findCourseByTitle(title);
    }
}

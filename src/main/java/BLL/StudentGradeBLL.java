/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import Model.StudentGrade;
import DAL.StudentGradeDAL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class StudentGradeBLL {
     private StudentGradeDAL sgDAL;
    public StudentGradeBLL()
    {
        sgDAL = new StudentGradeDAL();
    }
    public ArrayList<StudentGrade> readGrade(){
        return sgDAL.readGrade();
    }
    public int insertGrade(StudentGrade sg) throws SQLException{
        int result = sgDAL.insertGrade(sg);
        return result;
    }
    public int updateGrade(StudentGrade sg) throws SQLException{
        int result = sgDAL.updateGrade(sg);
        return result;
    }
    public int deleteCourse(int enrollmentID) throws SQLException{
        int result = sgDAL.deleteGrade(enrollmentID);
        return result;
    }
    public ArrayList<StudentGrade> findGradeByID(int enrollmentID){
       return sgDAL.findGradeByID(enrollmentID);
    }
    public ArrayList<StudentGrade> findGradeBySID(int studentID){
       return sgDAL.findStudentIDBySID(studentID);
    }
}

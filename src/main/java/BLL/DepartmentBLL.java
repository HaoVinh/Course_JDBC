/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import Model.Department;
import DAL.DepartmentDAL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DepartmentBLL {
     private DepartmentDAL dpDAL;
    public DepartmentBLL()
    {
        dpDAL = new DepartmentDAL();
    }
    public ArrayList<Department> readDepartment(){
        return dpDAL.readDepartment();
    }
    public int insertDepartment(Department sg) throws SQLException{
        int result = dpDAL.insertDepartment(sg);
        return result;
    }
    public int updateDepartment(Department sg) throws SQLException{
        int result = dpDAL.updateDepartment(sg);
        return result;
    }
    public int deleteCourse(int departmentID) throws SQLException{
        int result = dpDAL.deleteDepartment(departmentID);
        return result;
    }
    public ArrayList<Department> findDepartmentByID(int departmentID){
       return dpDAL.findDepartmentByID(departmentID);
    }
    public ArrayList<Department> findDepartmentByName(String name){
       return dpDAL.findDepartmentByName(name);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Department;
import Model.SQLConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DepartmentDAL {
     Connection connection = SQLConnection.getConnection();
    
    public ArrayList readDepartment(){
        ArrayList<Department> departmentList=new ArrayList<>();
        try {
            String query = "SELECT * FROM Department ";
            PreparedStatement ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    Department dp = new Department();
                    dp.setDepartmentID(rs.getInt("DepartmentID"));
                    dp.setName(rs.getString("Name"));
                    dp.setBudget(rs.getDouble("Budget"));
                    dp.setStartDate(rs.getDate("StartDate"));
                    dp.setAdministrator(rs.getInt("Administrator"));
                    departmentList.add(dp);
                }
            }

        } catch (Exception er) {
            er.printStackTrace();
        }
        return departmentList;
    }
    public int deleteDepartment(int departmentID) throws SQLException{
        String query = "DELETE FROM Department WHERE DepartmentID=?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setInt(1, departmentID);
        int result = ps.executeUpdate();
        return result;
    }
    public int updateDepartment (Department dp) throws SQLException{
        String query = "UPDATE Department SET Name = ? ,Budget = ?,StartDate=?,Administrator=?"
                + " WHERE DepartmentID = ?";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setString(1, dp.getName());
        ps.setDouble(2, dp.getBudget());
        ps.setDate(3, dp.getStartDate());
        ps.setInt(4, dp.getAdministrator());
        ps.setInt(5, dp.getDepartmentID());
        int result = ps.executeUpdate();
        return result;
    }
    public int insertDepartment(Department dp) throws SQLException{
        String query = "Insert Department(Name, Budget , StartDate , Administrator)"
                + " VALUES(?,?,?,?)";
        PreparedStatement ps = this.connection.prepareStatement(query);
        ps.setString(1, dp.getName());
        ps.setDouble(2, dp.getBudget());
        ps.setDate(3, dp.getStartDate());
        ps.setInt(4, dp.getAdministrator());
        int result = ps.executeUpdate();
        return result;
    }
    public ArrayList<Department> findDepartmentByID(int departmentID){
      ArrayList<Department> departmentList = new ArrayList<>();
    try{
     String query = "SELECT * FROM Department WHERE DepartmentID LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1,String.valueOf(departmentID));
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    Department dp = new Department();
                    dp.setDepartmentID(rs.getInt("EnrollmentID"));
                    dp.setName(rs.getString("Name"));
                    dp.setBudget(rs.getDouble("Budget"));
                    dp.setStartDate(rs.getDate("StartDate"));
                    dp.setAdministrator(rs.getInt("Administrator"));
                    departmentList.add(dp);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return departmentList;
}
     public ArrayList<Department> findDepartmentByName(String name){
      ArrayList<Department> departmentList = new ArrayList<>();
    try{
     String query = "SELECT * FROM Department WHERE Name LIKE ?";
     PreparedStatement ps = this.connection.prepareStatement(query);
     ps.setString(1, "%" + name + "%");
     ResultSet rs = ps.executeQuery();
     if (rs != null) {
                int i = 1;

                while (rs.next()) {
                     Department dp = new Department();
                    dp.setDepartmentID(rs.getInt("EnrollmentID"));
                    dp.setName(rs.getString("Name"));
                    dp.setBudget(rs.getDouble("Budget"));
                    dp.setStartDate(rs.getDate("StartDate"));
                    dp.setAdministrator(rs.getInt("Administrator"));
                    departmentList.add(dp);
                }
            }

     
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return departmentList;
}
}

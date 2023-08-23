
package Model;


import java.sql.Date;
public class Department {
    int departmentID, administrator ;
    Date startDate;
    String  name ;
    double budget;
    
   public Department(){
       
   }

    public Department(int departmentID, Date startDate, String name, double budget, int administrator) {
        this.departmentID = departmentID;
        this.startDate = startDate;
        this.name = name;
        this.budget = budget;
        this.administrator = administrator;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getAdministrator() {
        return administrator;
    }

    public void setAdministrator(int administrator) {
        this.administrator = administrator;
    }
   
}

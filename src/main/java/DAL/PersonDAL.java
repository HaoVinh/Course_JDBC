package DAL;

import Model.Person;
import Model.SQLConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAL {

    Connection connection = SQLConnection.getConnection();

    public ArrayList readPerson() {
        ArrayList<Person> personList = new ArrayList<>();
        try {
            String query = "SELECT * FROM Person";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    Person person = new Person();
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setFirstName(rs.getString("Firstname"));
                    person.setLastName(rs.getString("Lastname"));
                    person.setEnrollmentDate(rs.getDate("EnrollmentDate"));
                    person.setHireDate(rs.getDate("HireDate"));
                    personList.add(person);
                }
            }

        } catch (Exception er) {
            er.printStackTrace();
        }
        return personList;
    }

    public int deletePerson(int personID) {
        int result = -1;
        try {
            String query = "DELETE FROM Person WHERE PersonID=?";
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setInt(1, personID);
            result = ps.executeUpdate();
        } catch (Exception er) {
            er.printStackTrace();
        }
        return result;
    }

    public int updatePerson(Person person) {
        int result = -1;
        try {
            String query = "UPDATE Person SET Firstname = ? , Lastname = ? ,  EnrollmentDate= ? ,HireDate=? WHERE PersonID = ?";
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setDate(3, person.getEnrollmentDate());
            ps.setDate(4, person.getHireDate());
            result = ps.executeUpdate();

        } catch (Exception er) {
            er.printStackTrace();
        }
        return result;
    }

    public int insertPerson(Person person) {
        int result=-1;
        try {
            String query = "Insert Person(Firstname,Lastname,EnrollmentDate,HireDate) VALUES(?,?,?,?)";
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setDate(3, person.getEnrollmentDate());
            ps.setDate(4, person.getHireDate());
            result = ps.executeUpdate();

        } catch (Exception er) {
            er.printStackTrace();
        }

        return result;
    }

    public ArrayList<Person> findPersonByID(int personID) {
        ArrayList<Person> personList = new ArrayList<>();
        try {
            String query = "SELECT * FROM Person WHERE PersonID LIKE ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, String.valueOf(personID));
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Person person=new Person();
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setFirstName(rs.getString("Firstname"));
                    person.setLastName(rs.getString("Lastname"));
                    person.setEnrollmentDate(rs.getDate("EnrollmentDate"));
                    person.setHireDate(rs.getDate("HireDate"));
                    personList.add(person);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return personList;
    }

    public ArrayList<Person> findPersonByTitle(String title) {
        ArrayList<Person> personList = new ArrayList<>();
        try {
            String query = "SELECT * FROM Person WHERE Title LIKE ?";
            PreparedStatement ps = this.connection.prepareStatement(query);
            ps.setString(1, "%" + title + "%");
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                int i = 1;

                while (rs.next()) {
                    Person person=new Person();
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setFirstName(rs.getString("Firstname"));
                    person.setLastName(rs.getString("Lastname"));
                    person.setEnrollmentDate(rs.getDate("EnrollmentDate"));
                    person.setHireDate(rs.getDate("HireDate"));
                    personList.add(person);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return personList;
    }
}


package BLL;

import DAL.PersonDAL;
import Model.Person;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonBLL {
    private PersonDAL personDAL;
    public PersonBLL()
    {
        personDAL = new PersonDAL();
    }
    
    public ArrayList<Person> readPerson(){
        return personDAL.readPerson();
    }
    public int insertPerson(Person person) {
        int result = personDAL.insertPerson(person);
        return result;
    }
    public int updatePerson(Person person) {
        int result = personDAL.updatePerson(person);
        return result;
    }
    public int deletePerson(int personID) {
        int result = personDAL.deletePerson(personID);
        return result;
    }
    public ArrayList<Person> findPersonByID(int personID){
       return personDAL.findPersonByID(personID);
    }
    public ArrayList<Person> findPersonByTitle(String title){
       return personDAL.findPersonByTitle(title);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author manasa
 */
public class PersonRecord {
    private ArrayList<Person> personRec;
    
    public PersonRecord(){
        personRec = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonRec() {
        return personRec;
    }

    public void setPersonRec(ArrayList<Person> personRec) {
        this.personRec = personRec;
    }
    public Person addProfile(){
        Person p = new Person();
        personRec.add(p);
        return p;
    }
    
    public void deleteProfile(Person p){
        personRec.remove(p);
    }   
}

package ch.makery.address.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap (emballer) a list of persons. This is used for saving the
 * list of persons to XML.
 * rq : classe crée car on ne peut pas annoter la liste observable personData de la classe main
 * On crée donc une classe déstinée à contenir la liste de Person pour l'enregistrer en XML
 * 
 * @author Marco Jakob
 */

//nom de l'élèment racine
@XmlRootElement(name = "persons")
public class PersonListWrapper {

    private List<Person> persons;

    // nom optionnel pour l'élèment
    @XmlElement(name = "person")
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}

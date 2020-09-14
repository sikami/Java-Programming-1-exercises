
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        if(people.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        int shortestHeight;
        
        
        if(people.isEmpty()) {
            return null;
        } else {
            shortestHeight = people.get(0).getHeight();
        }
        
        String shortestguy = people.get(0).getName();
        for(Person guy : people) {
            if (guy.getHeight() < shortestHeight) {
                shortestHeight = guy.getHeight();
                shortestguy = guy.getName();
            }
        }
        
        Person newPerson = new Person(shortestguy, shortestHeight);
        
        return newPerson;
    }
    
    public Person take() {
        if (people.isEmpty()) {
            return null;
        }

        for (Person guy : people) {
            if(guy.equals(shortest())) {
                people.remove(guy);
                return guy;
            }
        }
        return null;
    }
    
    
    
    
    
}

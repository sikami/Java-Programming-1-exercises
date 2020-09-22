
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
public class Database {
     private ArrayList<Birds> flyingBirds;

    public Database() {
        this.flyingBirds = new ArrayList<>();
    }

    public void addBirds(Birds birds) {
        flyingBirds.add(birds);
    }

    public void printAllBirds() {
        for (Birds bird : flyingBirds) {
            System.out.println(bird);
        }
    }


    public boolean findBird(String bird) {
        for (Birds birds : flyingBirds) {
            if (birds.getName().equals(bird)) {
                return true;
            }
        }
        return false;
    }

    public void observe(String bird) {
        for (Birds birds : flyingBirds) {
            if (birds.getName().equals(bird) && birds.getObservation() == 0 || birds.getName().equals(bird) && birds.getObservation() > 0 ) {
                birds.addObservation();
            }
        }
    }

    public void printOneBird(String bird) {
        for (Birds birds : flyingBirds) {
            if (birds.getName().equals(bird)) {
                System.out.println(birds);
            }
        }
    }
}

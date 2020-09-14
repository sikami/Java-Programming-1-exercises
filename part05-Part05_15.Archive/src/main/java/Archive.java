/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Archive {
    
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String toString() {
        return this.identifier + ": " + name;
    }
    
    public boolean equals(Object archive) {
        if (this == archive) {
            return true;
        }
        
        if (!(archive instanceof Archive)) {
            return false;
        }
        
        Archive compared = (Archive) archive;
        
        if (this.identifier.equals(compared.identifier)) {
            return true;
        }
        
        return false;
    }
    
    
}

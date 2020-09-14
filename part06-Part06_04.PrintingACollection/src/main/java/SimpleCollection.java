
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public String getName() {
        return name;
    }
    

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String el = "";
        String elementPlular = "";
        for (String element : elements) {
            el +=  "\n" + element;
            if (elements.size() == 1) {
                elementPlular = " element:";
            } else {
                elementPlular = " elements:";
            }

        }

        if(this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        return "The collection " + this.name + " has " + elements.size() + elementPlular +
                el;        
        
        
        
        
    }
    
}

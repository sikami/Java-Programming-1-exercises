
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Recipe {
    
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public Recipe addIngredients(String name) {
        this.ingredients.add(name);
        return new Recipe(this.name, this.time, this.ingredients);
    }
    
    public void printIngredients() {
        for (String foodlist : this.ingredients) {
            System.out.println(foodlist);
        }

    }
    
    public String findIngredients(String food) {
        for (String foodList : this.ingredients) {
            if (foodList.equals(food)) {
                return foodList;
            }
        }
        return null;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
    
    
    
    
    
}

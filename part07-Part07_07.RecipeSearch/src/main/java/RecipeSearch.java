
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        
        
        searchRecipe();
       
            
    }
    
    
    public static void searchRecipe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        String name = "";
        String cursor = "";
        int duration = 0;
        ArrayList<Recipe> recipes = new ArrayList();
        ArrayList<String> ingredients = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            while (true) {
                name = scan.nextLine();
                duration = Integer.valueOf(scan.nextLine());
                cursor = scan.nextLine();

                while (scan.hasNextLine()) {
                    ingredients.add(cursor);
                    if(cursor.equals("")) {
                        break;
                    }
                    cursor  = scan.nextLine();
                }

                if(!scan.hasNextLine()) {
                    ingredients.add(cursor);
                }
                recipes.add(new Recipe(name, duration, ingredients));
                ingredients = new ArrayList<>();

            }

        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredients - searches recipes by ingredient");

        String command = "";
        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            if (command.equals("list")) {
                System.out.println("");
                for (Recipe list : recipes) {
                    System.out.println(list);
                }

            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("Recipes:");
                ArrayList<Recipe> food = findName(recipes, word);
                for (Recipe recipe : food) {
                    System.out.println(recipe);
                }
                
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                ArrayList<Recipe> list = findDuration(recipes, time);
                System.out.println("");
                System.out.println("Recipe:");
                for (Recipe recipe : list) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipe:");
                ArrayList<Recipe> food = findRecipeByIngredients(recipes, ingredient);
                for (Recipe recipe : food) {
                    System.out.println(recipe);
                }

            }

        }

    }

     public static ArrayList<Recipe> findName(ArrayList<Recipe> recipes, String name) {
        ArrayList<Recipe> list = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                list.add(recipe);
            }
        }
        return list;
    }

    public static ArrayList<Recipe> findDuration(ArrayList<Recipe> recipes, int duration) {
        ArrayList<Recipe> recipes1 = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= duration) {
                recipes1.add(recipe);
            }
        }
        return recipes1;
    }

    public static ArrayList<Recipe> findRecipeByIngredients(ArrayList<Recipe> recipes, String name) {
        ArrayList<Recipe> list = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.findIngredients(name)!= null) {
                list.add(recipe);
            }
        }
        return list;
    }
    
    
    
    
}

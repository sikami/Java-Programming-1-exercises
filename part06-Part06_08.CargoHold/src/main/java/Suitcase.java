
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {

        int sum = 0;
        for (Item i : items) {
            sum += i.getWeight();
        }

        if (items.isEmpty()) {
            items.add(item);
        } else if (item.getWeight() + sum <= maxWeight) {
            items.add(item);
        }


    }

    @Override
    public String toString() {
        int sum = 0;
        int count = 0;
        String plural = "";
        for (Item item : items) {
            sum += item.getWeight();
            count++;
            if (count == 1) {
                plural = "item";
            } else {
                plural = "items";
            }
        }

        if (items.isEmpty()) {
            return "no items (" + sum + " kg)";
        }
        return count + " " + plural + " (" + sum + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

//    public Item heaviestItem() {
//        if (items.isEmpty()) {
//            return null;
//        }
//
//        int heaviest = 0;
//        String name = items.get(0).getName();
//        for (Item item : items)  {
//            if (item.getWeight() > heaviest) {
//                heaviest = item.getWeight();
//                name = item.getName();
//            }
//        }
//        Item goods = new Item(name, heaviest);
//        return goods;
//    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item newItem = items.get(0);
        int heaviest = 0;
        for (Item item : items)  {
            if (item.getWeight() > heaviest) {
                heaviest = item.getWeight();
                newItem = item;
            }
        }
        return newItem;
    }





}

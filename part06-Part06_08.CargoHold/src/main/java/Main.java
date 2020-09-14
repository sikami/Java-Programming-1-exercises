
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
       
        Suitcase suitcase = new Suitcase(20);
        suitcase.addItem(new Item("Carrot", 2));
        suitcase.addItem(new Item("Stick", 8));
        suitcase.addItem(new Item("Cake", 4));

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
    }

}

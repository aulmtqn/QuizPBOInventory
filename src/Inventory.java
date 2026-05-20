import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> listitem;
    public Inventory() {
        this.listitem = new ArrayList<>();
    }

    public void add (Item item){
        listitem.add(item);
        System.out.println("Item called " + item.getName() + " has been added to inventory");
    }

}

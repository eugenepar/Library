import java.util.ArrayList;

public class Reader {
    private String name;
    private int id;
    private ArrayList<LibraryItem> materials = new ArrayList<>();

    Reader(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }

    public void rentItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.rent();
            materials.add(item);
        } else {
            System.out.println("Sorry item " + item.getTitle() + " is already rented");
        }
    }

    public void returnItem(LibraryItem item) {
        if (materials.contains(item)) {
            item.returnBack();
            materials.remove(item);
        } else {
            System.out.println("You can't return this " + item.getTitle() + " because it hasn't been rented yet!");
        }
    }

    public ArrayList<LibraryItem> getMaterials() {
        return materials;
    }
}



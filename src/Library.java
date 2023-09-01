import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private ArrayList<LibraryItem> materials = new ArrayList<>();
    private HashMap<Reader, ArrayList<LibraryItem>> readerHistory = new HashMap<>();

    public void addMaterial(LibraryItem item) {
        materials.add(item);
    }

    public void addMaterials(List<LibraryItem> items) {
        materials.addAll(items);
    }

    public void removeMaterial(LibraryItem item) {
        materials.remove(item);
    }

    public void removeMaterials(List<LibraryItem> items) {
        materials.removeAll(items);
    }

    public ArrayList<LibraryItem> getMaterials() {
        return materials;
    }

    public ArrayList<LibraryItem> getItemsByTitle(String title) {
        ArrayList<LibraryItem> itemsFound = new ArrayList<>();
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getTitle().equalsIgnoreCase(title)) {
                itemsFound.add(materials.get(i));
            }
        }
        return itemsFound;
    }

    public List<LibraryItem> getItemsByTitleWithStream(String title) {
        return materials.stream().filter(item -> item.getTitle().equalsIgnoreCase(title)).toList();
    }

    public void rent(Reader reader, LibraryItem item) {
        reader.rentItem(item);
        readerHistory.putIfAbsent(reader, new ArrayList<>());
        readerHistory.get(reader).add(item);
    }

    public void returItem(Reader reader, LibraryItem item) {
        reader.returnItem(item);
        if (readerHistory.containsKey(reader)) {
            readerHistory.get(reader).remove(item);
        }
    }

    public HashMap<Reader, ArrayList<LibraryItem>> getReaderHistory() {
        return readerHistory;
    }
}


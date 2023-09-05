import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Mark Twain", 1756, 666, "Tom Soyer");
        Book book1 = new Book("Peter PArker", 2021, 10, "Spiderman");
        Book book2 = new Book("JackSparrow", 2021, 2, "Spiderman");

        Magazine magazine = new Magazine("Cannabis", "Bob Marley", 222);

        Newspaper newspaper = new Newspaper("ForMen", 1);

        Library library = new Library();
        System.out.println("Add books to Library");

        library.addMaterial(book2);
        library.addMaterial(book);
        library.addMaterial(book1);

        System.out.println("Get materials from Library");
        System.out.println(library.getMaterials());

        System.out.println("Add materials to Library");
        library.addMaterials(Arrays.asList(magazine, newspaper));

        System.out.println("Get materials from Library");
        System.out.println(library.getMaterials());

        System.out.println("Remove materials from Library");
        library.removeMaterial(book);

        System.out.println("Get materials from Library");
        System.out.println(library.getMaterials());

        System.out.println("Remove materials from Library");
        library.removeMaterials(Arrays.asList(newspaper, magazine));

        System.out.println("Get materials from Library");
        System.out.println(library.getMaterials());

        System.out.println("Get items by title: Spiderman");
        System.out.println(library.getItemsByTitle("Spiderman"));
        Reader reader = new Reader("Eugene", 22);
        library.rent(reader, book);
        System.out.println(library.getReaderHistory());
        library.returItem(reader, book);

    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Mark Twain", 1756,666,"Tom Soyer");
        Book book1 = new Book("Peter PArker",2021,10,"Spiderman");
        Book book2 = new Book("JackSparrow",2021,2,"Spiderman");
        Magazine magazine = new Magazine("Cannabis","Bob Marley",222);
        Newspaper newspaper = new Newspaper("ForMen",1);
        Library library = new Library();
        library.addMaterial(book2);
        library.addMaterial(book);
        library.addMaterial(book1);
        System.out.println(library.getMaterials());
        library.addMaterials(Arrays.asList(magazine,newspaper));
        System.out.println(library.getMaterials());
        library.removeMaterial(book);
        System.out.println(library.getMaterials());
        library.removeMaterials(Arrays.asList(newspaper,magazine));
        System.out.println(library.getMaterials());
        System.out.println(library.getItemsByTitle("Spiderman"));
        Reader reader = new Reader("Eugene",22);
        library.rent(reader,book);
        System.out.println(library.getReaderHistory());
        library.returItem(reader,book);
        System.out.println(library.getItemsByTitleWithStream("Spiderman"));




    }
}
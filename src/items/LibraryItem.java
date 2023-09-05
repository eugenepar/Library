package items;

import interfaces.Readable;
import interfaces.Rentable;

public class LibraryItem implements Readable, Rentable {
    protected String title;
    protected String author;
    protected boolean is_available;

    LibraryItem(String title, String author) {
        is_available = true;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean isAvailable() {
        return this.is_available;
    }

    public void rent() {
        if (is_available) {
            System.out.println("You can rent this awesome item " + title);
            is_available = false;
        } else {
            System.out.println("Not available! Somebody took  " + title + " !!! Loser!!!");
        }
    }

    public void returnBack() {
        if (is_available) {
            System.out.println("you can't return this item because it is not rented yet");
        } else {
            System.out.println(title + " you have successfully returned this item");
            is_available = true;
        }
    }

    public String toString() {
        return this.title + this.author;
    }
}

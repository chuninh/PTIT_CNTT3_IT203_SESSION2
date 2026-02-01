package ss6;

class Book {

    private String bookId;
    private String title;
    private String author;

    Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Ma sach: " + bookId);
        System.out.println("Tieu de: " + title);
        System.out.println("Tac gia: " + author);
        System.out.println("----------------------");
    }
}

public class bai5 {
    public static void main(String[] args) {

        Book b1 = new Book("B001", "Lap trinh Java", "Nguyen Van A");

        b1.displayInfo();
    }
}

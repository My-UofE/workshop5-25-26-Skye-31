class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }

    public String toString() {
        String authorsString = "";
        boolean first = true;
        for (Author author : this.authors) {
            if (!first) authorsString += ",";
            authorsString += author.toString();
            first = false;
        }
        return String.format("Book[name=%s,authors={%s},price=%.2f,qty=%d]", this.name, authorsString, this.price, this.qty);
    }

    public String getAuthorNames() {
        String valueString = "";
        boolean first = true;
        for (Author author : this.authors) {
            if (!first) valueString += ",";
            valueString += author.getName();
            first = false;
        }
        return valueString;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

public class BookApp {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Pip Jones", "pjones@java.org", 'u');
        authors[1] = new Author("Bessie Carter", "b.carter@java.org", 'f');
        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummies", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}
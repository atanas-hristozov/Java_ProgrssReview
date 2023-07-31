public class Book {
    final private String name;
    final private int numberOfPages;
    final private String nameOfAuthor;
    private double price;

    public Book(String name, int numberOfPages, String nameOfAuthor, double price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.nameOfAuthor = nameOfAuthor;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return this.name.equals(book.name) && this.nameOfAuthor.equals(book.nameOfAuthor);
    }
}

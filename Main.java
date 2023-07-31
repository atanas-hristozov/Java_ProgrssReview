public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Kniga", 22, "Awtor", 12.50);
        Book book2 = new Book("Kniga", 22, "Awtor", 12.50);
        System.out.println(book1.equals(book2)); // true
        changePrice(book1);
        System.out.println(book1.getPrice());//
    }

    private static void changePrice(Book book1) {
        book1.setPrice(24);
    }


}
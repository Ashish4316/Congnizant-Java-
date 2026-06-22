public class MVCPatternTest {
    public static void main(String[] args) {
        System.out.println("--- MVC Pattern Test ---");

        Book book = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        BookView view = new BookView();

        BookController controller = new BookController(book, view);

        controller.updateView();

        System.out.println("Updating Book Title...");
        controller.setBookTitle("Effective Java - 3rd Edition");

        controller.updateView();
    }
}

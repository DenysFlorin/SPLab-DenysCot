//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a book
        Book myBook = new Book("Design Patterns");

        // Add authors
        Author author1 = new Author("John", "Doe");
        Author author2 = new Author("Jane", "Smith");
        myBook.addAuthor(author1);
        myBook.addAuthor(author2);

        // Create a section
        Section section1 = new Section("Introduction");
        section1.add(new Paragraph("This is an introduction."));
        section1.add(new Image("intro.png"));
        section1.add(new Table("Table of contents"));

        // Add section to book
        myBook.add(section1);

        // Print the book structure
        myBook.print();
    }
}

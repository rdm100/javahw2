import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Borrower borrower;


    @Before
    public void before() {
        library = new Library(3);
        book = new Book();
        borrower = new Borrower();
    }

    @Test
    public void libraryStockLevel(){
        assertEquals(0, library.stockCheck());
    }

    @Test
    public void canYouAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.stockCheck());
    }

    @Test
    public void getCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void canSubtractBook(){
        library.addBook(book);
        assertEquals(1, library.stockCheck());
        library.subtractBook();
        assertEquals(0, library.stockCheck());
    }

    @Test
    public void borrowBook(){
        library.addBook(book);
        borrower.clientBorrowsBook(library);
        assertEquals(1, borrower.booksBorrowed());
    }

}

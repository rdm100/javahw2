import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowersBooks;

    public Borrower(){
        this.borrowersBooks = new ArrayList<>();
    }

    public int booksBorrowed(){
        return this.borrowersBooks.size();
    }

    public void clientBorrowsBook(Library library){
//        Book result = library.subtractBook();
//        this.borrowersBooks.add(result);
        this.borrowersBooks.add(library.subtractBook());
    }


}


import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int stockCheck(){
        return this.stock.size();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addBook(Book book) {
        if (stockCheck() < this.capacity) {
            this.stock.add(book);
        }
    }

        public Book subtractBook(){
            return this.stock.remove(0);
        }



    }




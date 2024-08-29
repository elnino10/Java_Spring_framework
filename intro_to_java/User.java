import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDate;
    private ArrayList<Book> books = new ArrayList<>();

    User(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    // name getter function
    public String name() {
        return this.name;
    }

    // birth date  getter function
    public String birthDate() {
        return this.birthDate.toString();
    }

    // book list getter function
    public String books() {
        return this.books.toString();
    }

    // name setter function
    public void setName(String name) {
        this.name = name;
    }

    // a user's borrowed books
    public void borrow(Book book) {
        this.books.add(book);
    }

    // returns number of books borrowed
    public int booksCount() {
        return this.books.size();
    }

    // calculates the user's age
    public int getAge() {
        Period ageDiff = Period.between(this.birthDate, LocalDate.now());

        return ageDiff.getYears();
    }
}
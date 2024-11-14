package HashWork;
import java.util.*;
public class BookDriver {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Book>>  books = getBooksFromSomewhereUseHMofAL();
        //Book(String title, String author, String BookType, int year, double rating
//        Book myBook = new Book( "I Robot", "Asimov", "Fiction", 1965, 4.5);
//        System.out.printf("\n Book Info:%s", myBook.toString());
//        System.exit(1);
//        HashMap<String,  Book > books =  getBooksFromSomewhere();
        String uAuthor = getUserInput( books.keySet());
        System.out.printf("interest:%s", uAuthor);
//        Book b = books.get(uAuthor);
        ArrayList<Book>  aBooks = books.get(uAuthor);
        for( Book b : aBooks ){
            System.out.printf("\n The Books by%s is %s", uAuthor, b.toString());
        }
//        System.out.printf("\nThe book by:%s is %s", uAuthor, b.toString());
    }
    private static String getUserInput(Set<String> authList ) {
        String authors = authList.toString();
        Scanner s = new Scanner(System.in);
        String inAuth = null;
        boolean gotIt = false;
        while ( !gotIt ){
            System.out.printf("Enter Author %s ->", authors);
            inAuth =  s.nextLine();
            if ( authList.contains(inAuth )){
                gotIt = true;
            } else {
                System.out.printf("\n No really ... thats not in the list");
            }
        }
        return inAuth;
    }

    private static HashMap<String, ArrayList<Book>> getBooksFromSomewhereUseHMofAL() {
        HashMap<String, ArrayList<Book>> books = new HashMap<>();
        ArrayList<Book> tBooks = new ArrayList<>();
        tBooks.add( new Book( "The Fellowship of the Ring", "Tolken", "Fiction", 1954, 5 ));
        tBooks.add( new Book( "The Two Towers", "Tolken", "Fiction", 1966, 5 ));
        tBooks.add(new Book( "The Return of the King", "Tolken", "Fiction", 1966, 5 ));
        books.put("Tolken", tBooks);

        ArrayList<Book> oBooks = new ArrayList<>();
        oBooks.add(  new Book("1984", "Orwell", "Fiction", 1948, 4.7));
        oBooks.add( new Book("Animal Farm", "Orwell", "Fiction", 1944, 4.7));
        books.put("Orwell", oBooks);
        // Can you add tolstoy?
        return books;
    }
    private static HashMap<String, Book> getBooksFromSomewhere() {
        HashMap<String, Book> books = new HashMap<>();
//        HashMap<String, ArrayList<Book>> books = new HashMap<>();
        // The problem with the data structure is multiple books by same
        //    author overwrites previous book
        Book b = new Book( "The Hobbit", "Tolken", "Fiction", 1937, 5 );
        books.put( "Tolken",b);

        books.put( "Tolken",new Book( "The Fellowship of the Ring", "Tolken", "Fiction", 1954, 5 ));
        books.put( "Tolken",new Book( "The Two Towers", "Tolken", "Fiction", 1966, 5 ));
        books.put( "Tolken",new Book( "The Return of the King", "Tolken", "Fiction", 1966, 5 ));

        books.put( "Hawking", new Book("Brief History of Time", "Hawking", "NonFiction", 1988, 5));

        books.put( "Orwell", new Book("1984", "Orwell", "Fiction", 1948, 4.7));
        books.put( "Orwell", new Book("Animal Farm", "Orwell", "Fiction", 1944, 4.7));
        books.put( "Heller", new Book("Catch-22", "Heller", "Fiction", 1922, 4.3));
        books.put( "Tolstoy", new Book("Anna Karenina", "Tolstoy", "Fiction", 1878, 4.3));
        books.put( "Tolstoy", new Book("War and Peace", "Tolstoy", "Fiction", 1865, 5));
        books.put( "Tolstoy", new Book("A Confession", "Tolstoy", "Fiction", 1882, 5));
        books.put( "Carnegie", new Book("How to Win Friends and Influence People", "Carnegi", "NonFiction", 1936, 4.3));
        return books;
    }
}

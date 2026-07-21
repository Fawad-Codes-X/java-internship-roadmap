package Week3.Day2;

import java.util.Optional;

public class MiniTask {

    public static class Book{
        private String title;
        private String isbn;

        public Book(String title, String isbn){
            this.title = title;
            this.isbn = isbn;
        }

        public String getIsbn(){
            return isbn;
        }

        public String getTitle(){
            return  title;
        }
    }

    public static class User{
        String username;

        public User(String username){
            this.username = username;
        }

        public String getUsername(){
            return username;
        }

    }


    public static Optional<Book> findBookByIsbn(String isbn){
        if("123".equals(isbn)){
            return Optional.of(new Book("123", "Java Basics"));
        }
        return Optional.empty();
    }

    public static Optional<User> findUser(String username){
        if("fawad".equalsIgnoreCase(username)){
            return Optional.of(new User("Fawad"));
        }
        return Optional.empty();
    }

    public static void main(String[] args){
        Optional<Book> book = findBookByIsbn("123");

        book.ifPresent(b-> System.out.println("Book Found" + b.getClass()));

        String bookMessage = findBookByIsbn("999").map(Book::getTitle).orElse("Book Not Found");

        System.out.println(bookMessage);

        System.out.println();

        String userMessage = findUser("Fawad").map(user -> "Welcome" + user.getUsername()).orElse("User Not Found");

        System.out.println(userMessage);

        String anotherUser = findUser("Ali").map(user -> "Welcome" + user.getUsername()).orElse("User Not Found");

    }

}

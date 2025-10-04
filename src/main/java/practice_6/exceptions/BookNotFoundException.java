package practice_6.exceptions;

// проверяемое - наследуется от Exception (наследников)
public class BookNotFoundException extends Exception {
    public BookNotFoundException (String message){
        super(message);
    }
}

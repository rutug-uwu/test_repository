package practice_6.exceptions;

// непроверяемый (unchecked) - имплементируются от 2-ух: error и RunTimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }
}

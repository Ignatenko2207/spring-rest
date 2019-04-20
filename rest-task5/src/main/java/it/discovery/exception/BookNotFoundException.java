package it.discovery.exception;

@SuppressWarnings("serial")
public class BookNotFoundException extends RuntimeException {

    private int errorCode;

    public int getErrorCode() {
        return errorCode;
    }

    public BookNotFoundException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}

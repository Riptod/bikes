package exception;

public class FailReadWriteFileException extends RuntimeException {
    public FailReadWriteFileException(String message, Throwable cause) {
        super(message, cause);
    }
}

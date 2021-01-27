package klaidos;

public class ManoException extends Exception { //mano klaida

    public ManoException() {
    }

    public ManoException(String message) {
        super(message);
    }

    public ManoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManoException(Throwable cause) {
        super(cause);
    }
}

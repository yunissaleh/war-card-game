public class NotAvailableException extends RuntimeException {

    private String message;

    public NotAvailableException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

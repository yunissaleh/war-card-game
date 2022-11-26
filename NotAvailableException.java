package Y2_Lab3.HW3;


public class NotAvailableException extends RuntimeException {

    private String message;

    public NotAvailableException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

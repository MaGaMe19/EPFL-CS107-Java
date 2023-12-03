public class VibeException extends Exception {
    public VibeException() {
        super("The vibes weren't there.");
    }

    public VibeException(String message) {
        super(message);
    }
}

package profdz.task3;

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException() {
    }

    public MyUncheckedException(String message) {
        super(message);
    }
}

package profdz.task2;

public class MyUncheckedException extends ArrayIndexOutOfBoundsException {
    public MyUncheckedException() {
    }

    public MyUncheckedException(String message) {
        super(message);
    }
}

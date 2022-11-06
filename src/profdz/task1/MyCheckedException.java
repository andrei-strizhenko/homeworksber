package profdz.task1;

import java.io.IOException;

public class MyCheckedException extends IOException {
    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }
}
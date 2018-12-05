package by.bsuir.flowerShop.exception;


import java.io.IOException;

public class IncorrectInputException extends IOException {

    public IncorrectInputException() {
        super();
    }

    public IncorrectInputException(String message){
        super(message);
    }

    public IncorrectInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectInputException(Throwable cause) {
        super(cause);
    }
}

package ro.ase.cts.lab02.exceptions;

public class InvalidPriceValueException extends Exception {

    @Override
    public String getMessage() {
        return "Price should be at least 0";
    }
}

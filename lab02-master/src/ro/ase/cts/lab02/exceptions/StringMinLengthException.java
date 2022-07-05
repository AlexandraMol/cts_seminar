package ro.ase.cts.lab02.exceptions;

public class StringMinLengthException extends Exception {

    @Override
    public String getMessage() {
        return "String should be at least 5 characters";
    }
}

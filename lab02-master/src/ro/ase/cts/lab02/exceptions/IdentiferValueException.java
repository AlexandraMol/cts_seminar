package ro.ase.cts.lab02.exceptions;

public class IdentiferValueException extends Exception{

    @Override
    public String getMessage() {

        return "Id should be at least 1.";
    }
}

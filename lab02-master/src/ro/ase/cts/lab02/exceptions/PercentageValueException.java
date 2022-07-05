package ro.ase.cts.lab02.exceptions;

public class PercentageValueException extends Exception {

    @Override
    public String getMessage() {

        return "Percentage should take values between 0 and 100";
    }
}

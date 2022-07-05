package ro.ase.cts.lab02.exceptions;

public class AmountDiscountValueException extends Exception{
    @Override
    public String getMessage() {

        return "Discount should not be greater than the price of the product.";
    }
}

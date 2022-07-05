package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.IdentiferValueException;
import ro.ase.cts.lab02.exceptions.StringMinLengthException;

import java.util.List;

public class User {

    private int id;
    private String username;
    private String name;
    private List<Order> orderHistory;
    private Cart shoppingCart;

    public User(int id, String username, String name) {
        try{
            if(id<1){
                throw new IdentiferValueException();
            }else{
                this.id = id;
            }
            if(username.length()<5){
                throw new StringMinLengthException();
            }else{
                this.username = username;
            }
            if(name.length()<5){
                throw new StringMinLengthException();
            }else{
                this.name = name;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void addOderToHistory(Order order){
        this.orderHistory.add(order);
    }

    public void addProductToCart(Product product){
        this.shoppingCart.getProductList().add(product);
    }

}

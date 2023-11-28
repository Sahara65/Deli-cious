package org.delicious.Model.Order;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private List<OrderedItem> itemsInCart;

    public Order(){
        itemsInCart = new ArrayList<>();
    }

    public void addItemsCart(OrderedItem items){
        itemsInCart.add(items);
    }

    public void removeItemsCart(OrderedItem items){
        itemsInCart.remove(items);
    }
}

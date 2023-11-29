package org.delicious.Model.Order;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private final List<OrderedItem> itemsInCart;

    public Order() {
        itemsInCart = new ArrayList<>();
    }

    public void addItemsCart(OrderedItem item) {
        itemsInCart.add(item);
    }

    public void removeItemsCart(OrderedItem item) {
        itemsInCart.remove(item);
    }

    // Getter for itemsInCart
    public List<OrderedItem> getItemsInCart() {
        return itemsInCart;
    }
}

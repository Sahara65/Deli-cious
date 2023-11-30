package org.delicious.model.order;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private final List<OrderedItem> items;

    public Order() {
        items = new ArrayList<>();
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

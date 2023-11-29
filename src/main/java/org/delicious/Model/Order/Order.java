package org.delicious.Model.Order;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private final List<OrderedItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItemsCart(OrderedItem item) {
        items.add(item);
    }

    public void removeItemsCart(OrderedItem item) {
        items.remove(item);
    }

    // Getter for itemsInCart
    public List<OrderedItem> getItems() {
        return items;
    }
}

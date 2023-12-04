package org.delicious.model.order;

import java.util.List;
import java.util.ArrayList;

public class Order {

    // TODO connect this to the Screens.

    private final List<OrderedItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addToCart(OrderedItem item) {
        items.add(item);
    }

    public void removeFromCart(OrderedItem item) {
        items.remove(item);
    }

    public List<OrderedItem> getItemsInCart() {
        return items;
    }
}
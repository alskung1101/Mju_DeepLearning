package Inventory;

import Entity.Item;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemInventory {
    private List<Item> items = new ArrayList<>();

    public void addItem(String stockName, String category) { }

    public void reviseItem(String stockName, String category) { }

    public String getItemStock() { return ""; }

    public void sortByExpirationDate() { }

    public void deleteItemStock(String stockName, String category) { }

    public Boolean selectItem() { return true; }
}

package Inventory;

import Entity.Food;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class FoodInventory {
    private List<Food> foods = new ArrayList<>();

    public void addFood(String stockName, String category) { }
    public void reviseFood(String stockName, String category) { }
    public String getFoodStock() { return ""; }
    public void sortByExpirationDate() { }
    public void deleteFoodStock(String stockName, String category) { }
    public Boolean selectFood() { return true; }
}
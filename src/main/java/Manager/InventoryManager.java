package Manager;

import DTO.FoodDTO;
import DTO.ItemDTO;
import Entity.Food;
import Entity.Item;
import Inventory.FoodInventory;
import Inventory.ItemInventory;
import Repository.FoodRepository;
import Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class InventoryManager {

    private final FoodRepository foodRepository;
    private final FoodInventory foodInventory;
    private final ItemRepository itemRepository;
    private final ItemInventory itemInventory;

    @Autowired
    public InventoryManager(FoodRepository foodRepository, FoodInventory foodInventory,
                            ItemRepository itemRepository, ItemInventory itemInventory) {
        this.foodRepository = foodRepository;
        this.foodInventory = foodInventory;
        this.itemRepository = itemRepository;
        this.itemInventory = itemInventory;
    }

    public Optional<Food> findFoodById(Long id) {
        return Optional.empty();
    }

    public void addFoodToInventory(String foodName, String category) { }

    public void reviseFoodInInventory(String foodName, String category) { }

    public String getFoodStock() {
        return "";
    }

    public void sortFoodByExpirationDate() { }

    public void deleteFoodStock(String foodName, String category) { }

    public Boolean selectFood() {
        return true;
    }

    public void saveItem(ItemDTO itemDTO) {

    }

    public Optional<Item> findItemById(Long id) {
        return Optional.empty();
    }

    public void addItemToInventory(String itemName, String category) { }

    public void reviseItemInInventory(String itemName, String category) { }

    public String getItemStock() {
        return "";
    }

    public void sortItemByExpirationDate() { }

    public void deleteItemStock(String itemName, String category) { }

    public Boolean selectItem() {
        return true;
    }
}

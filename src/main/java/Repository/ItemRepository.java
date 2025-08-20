package Repository;

import Entity.Item;
import Entity.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {


    Optional<Item> findByItemNameAndRestaurantIdAndCategory(String itemName, Long restaurantId, String category);

    Item createItem(String itemName, int quantity, String category, double itemPrice,
                    String supplier, boolean isDefective, int usagePeriod, String storageLocation, Long restaurantId);
}

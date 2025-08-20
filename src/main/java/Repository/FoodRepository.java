package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import Entity.Food;
import java.util.Optional;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long>  {

    Optional<Food> findByFoodNameAndRestaurantIdAndCategory(String foodName, Long restaurantId, String category);

    Food createFood(String foodName, int quantity, String category, String expirationDate, double foodPrice,
                    String purchaseDate, String supplier, boolean isDefective, String allergens, String nutrients,
                    int usagePeriod, String storageLocation, Long restaurantId);
}






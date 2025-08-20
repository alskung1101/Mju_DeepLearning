package Repository;

import Entity.Food;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ConcreteFoodRepository implements FoodRepository {

    private List<Food> foods = new ArrayList<>(); // 음식 데이터를 저장하는 리스트

    @Override
    public Optional<Food> findByFoodNameAndRestaurantIdAndCategory(String foodName, Long restaurantId, String category) {
        return Optional.empty();
    }

    @Override
    public Food createFood(String foodName, int quantity, String category, String expirationDate, double foodPrice,
                           String purchaseDate, String supplier, boolean isDefective, String allergens, String nutrients,
                           int usagePeriod, String storageLocation, Long restaurantId) {
        return new Food();
    }

    @Override
    public <S extends Food> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Food> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Food> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Food> findAll() {
        return null;
    }

    @Override
    public Iterable<Food> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
    }

    @Override
    public void delete(Food entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
    }

    @Override
    public void deleteAll(Iterable<? extends Food> entities) {
    }

    @Override
    public void deleteAll() {
    }
}

package DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodDTO {
    private int foodQuantity;
    private String foodName;
    private String foodCategory;
    private String expirationDate;
    private double foodPrice;
    private String purchaseDate;
    private String supplier;
    private boolean isDefective;
    private String allergens;
    private String nutrients;
    private int usagePeriod;
    private String storageLocation;
    private Long restaurantId;

}


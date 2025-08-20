package DTO;

public class ItemDTO {
    private String itemName;
    private int itemQuantity;
    private String itemCategory;
    private double itemPrice;
    private String supplier;
    private boolean isDefective;
    private int usagePeriod;
    private String storageLocation;
    private Long restaurantId;

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public boolean isDefective() {
        return isDefective;
    }

    public void setDefective(boolean isDefective) {
        this.isDefective = isDefective;
    }

    public int getUsagePeriod() {
        return usagePeriod;
    }

    public void setUsagePeriod(int usagePeriod) {
        this.usagePeriod = usagePeriod;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}

package Permission;

import Manager.InventoryManager;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StaffPermission implements Permission {

    private static final int PERMISSION_LEVEL = 2;
    private InventoryManager inventoryManager;

    @Override
    public void addStock(String stockName, String category) { }
    @Override
    public void reviseStock(String stockName, String category) { }
    @Override
    public String getStock() { return ""; }
    @Override
    public void setExpirationDate(String date) { }
    @Override
    public String getExpirationDate() { return ""; }
    @Override
    public void setCategory(String category) { }
    @Override
    public String getCategory() { return ""; }
    @Override
    public void sortByExpirationDate(String date) { }
    @Override
    public void deleteStock(String stockName, String category) { }
    @Override
    public boolean selectItem() { return false; }

    @Override
    public void addItemStock(String stockName, String category) { }
    @Override
    public void reviseItemStock(String stockName, String category) { }
    @Override
    public void getItemStock() { }
    @Override
    public void setItemCategory(String category) { }
    @Override
    public void sortByUsagePeriod(String period) { }
    @Override
    public void deleteItemStock(String stockName, String category) { }
    @Override
    public void invite(String phone) { }
    @Override
    public void closure() { }
}

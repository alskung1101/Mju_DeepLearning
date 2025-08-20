package Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ExpenseItem {
    private String date;
    private String itemName;
    private int quantity;
    private int price;
    private Long index;
    private Long restaurantId;

    private boolean isFood;
}
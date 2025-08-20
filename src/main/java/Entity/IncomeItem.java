package Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class IncomeItem {
    private String date;
    private int amount;
    private  String description;
    private Long restaurantId;
}
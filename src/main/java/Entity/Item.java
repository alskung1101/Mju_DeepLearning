package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    @Id
    private Long id;
    private String itemName;
    private int quantity;
    private String category;
    private double itemPrice;
    private String supplier;
    private boolean isDefective;
    private int usagePeriod;
    private String storageLocation;
    private Long restaurantId;
}

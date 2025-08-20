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
public class Food {
    @Id
    private Long id;
    private String foodName;
    private int quantity;
    private String category;
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

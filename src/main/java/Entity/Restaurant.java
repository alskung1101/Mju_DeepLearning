package Entity;

import lombok.Builder;

import java.sql.Date;
import java.util.List;

@Builder
public class Restaurant {
    private Long id;
    private List<Worker> workers;
    private String name;
    private Date openingDate;
    private String address;
    private boolean isClosure;
    //private IntergratedSchedule schedules;
    //private FoodInventory foodInventory;
    //private ItemInventory itemInventory;
    //private DataExpense dataExpense;
}

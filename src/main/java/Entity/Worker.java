package Entity;
import Aggregates.IntergratedSchedule;
import Permission.Permission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker {
    private Long id;
    private String workerEmail;
    private Long restaurantId;
    private Permission permission;

    private int permissionLevel;
    private String bankAccount;
    private IntergratedSchedule schedules;
    private long salary;
    private int hourlywage;

}

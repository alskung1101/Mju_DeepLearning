package Entity;
import Permission.Permission;

public class Worker {
    private Long id;
    private String workerEmail;
    private Long restaurantId;
    private Permission permission;

    private int permissionLevel;
    private String bankAccount;
    //private IntergratedSchedule schedules;
    private long salary;
    private int hourlywage;
}

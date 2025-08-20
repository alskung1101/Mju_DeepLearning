package Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Builder
public class Schedule {
    private Long restaurantId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isArrived;
    private boolean isDeparted;
    private Long workerId;

    public boolean checkArrived(){
        return false;
    }

    public boolean checkDeparted(){
        return false;
    }

    public void sendObjection(){

    }
}

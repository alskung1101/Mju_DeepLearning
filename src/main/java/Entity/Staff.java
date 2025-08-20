package Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Staff extends Worker{
    private boolean isResignation;
    private int bonus;
    private String performance;
}

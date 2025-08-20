package DTO;

import Entity.Worker;

import java.time.LocalDateTime;

public class ScheduleDTO {
    public LocalDateTime startTime;
    public LocalDateTime endTime;
    public Worker worker;
}

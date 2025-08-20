package DTO;

import lombok.Getter;

import java.sql.Date;

@Getter
public class RestaurantDTO {
    public String name;
    public Date openingDate;
    public String address;
}

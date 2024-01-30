package Utilities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RowCar {

    private int id;
    private String brand;
    private String model;
    private int year;
    private boolean availableToBuy;

    public RowCar(int id, String brand, String model, int year, boolean availableToBuy) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.availableToBuy = availableToBuy;
    }
}

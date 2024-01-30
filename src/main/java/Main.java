import Utilities.ReadExcelCars;
import Utilities.RowCar;
import Utilities.SerializeToFile;
import cars.generated.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String pathToSaveFiles = "";

        ReadExcelCars readExcelCars = new ReadExcelCars();
        ArrayList<RowCar> rowCars = readExcelCars.read();

        for (int i = 0; i < rowCars.size(); i++) {
            Car car = Car.newBuilder()
                    .setId(rowCars.get(i).getId())
                    .setBrand(rowCars.get(i).getBrand())
                    .setModel(rowCars.get(i).getModel())
                    .setYear(rowCars.get(i).getYear())
                    .setAvailableToBuy(rowCars.get(i).isAvailableToBuy())
                    .build();

            SerializeToFile.serializeAndWriteToFile(car, pathToSaveFiles + rowCars.get(i).getId() + ".txt");
        }
    }
}

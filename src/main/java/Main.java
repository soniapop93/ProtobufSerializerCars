import Utilities.ReadExcelCars;


public class Main {
    public static void main(String[] args) {
//        Car car = Car.newBuilder()
//                .setId(1)
//                .setBrand("Volkswagen")
//                .setModel("Golf GTI")
//                .setYear(2024)
//                .setAvailableToBuy(false)
//                .build();
//
//        serializeAndWriteToFile(car);
        ReadExcelCars readExcelCars = new ReadExcelCars();
        readExcelCars.read();

    }


}

package Utilities;

import cars.generated.Car;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializeToFile {
    public static void serializeAndWriteToFile(Car car, String filePath) {
        Path path = Paths.get(filePath);

        try {
            car.writeTo(Files.newOutputStream(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

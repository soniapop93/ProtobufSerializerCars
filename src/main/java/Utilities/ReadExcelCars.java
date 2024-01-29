package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadExcelCars {
    final String fileName = "Cars.xlsx";
    public void read() {
        FileInputStream file = null;

        try {
            file = new FileInputStream(fileName);

            Workbook workbook = new XSSFWorkbook(file);

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.println(cell);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

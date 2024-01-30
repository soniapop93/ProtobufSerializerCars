package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ReadExcelCars {
    final String fileName = "Cars.xlsx";
    public ArrayList<RowCar> read() {
        ArrayList<RowCar> carRows = new ArrayList<>();

        FileInputStream file = null;

        try {
            file = new FileInputStream(fileName);

            Workbook workbook = new XSSFWorkbook(file);

            Sheet sheet = workbook.getSheetAt(0);

            int indexRowCount = 0;

            for (Row row : sheet) {
                // will process only the rest of rows, not the header from Excel
                if (indexRowCount != 0) {
                    int id = (int)(row.getCell(0).getNumericCellValue());
                    String brand = String.valueOf(row.getCell(1));
                    String model= String.valueOf(row.getCell(2));
                    int year = (int)row.getCell(3).getNumericCellValue();
                    boolean availableToBuy = Boolean.valueOf(String.valueOf(row.getCell(3)));

                    RowCar rowCar = new RowCar(id, brand, model, year, availableToBuy);
                    carRows.add(rowCar);
                }
                indexRowCount++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return carRows;
    }
}

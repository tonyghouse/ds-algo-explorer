package dsalgoexplorer.test;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestExplorerOne {

    public static void main(String[] args) {
        List<String> links = new ArrayList<>();

        // Path to the XLSX file
        String filePath = "/Users/king/Downloads/Cheat-Sheet.xlsx"; // Replace with your file path

        FileInputStream file = null;
        XSSFWorkbook workbook = null;

        try {
            file = new FileInputStream(new File(filePath));

            // Create Workbook instance holding reference to .xlsx file
            workbook = new XSSFWorkbook(file);

            // Get the first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each row one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    // Check the cell type and format accordingly
                    String cellValue = getString(cell);

                    String link = getLinkIfExists(cellValue);
                    if(link !=null){
                        links.add(link);
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       for(String link: links){
           System.out.println("> "+link);
       }
    }

    private static String getLinkIfExists(String value) {
        if(value !=null && value.startsWith("http")) {
            return value;
        }
        return null;
    }

    private static String getString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            default:
               return null;
        }
    }
}

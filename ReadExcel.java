package week6.day2;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+ fileName + ".xlsx");

		XSSFSheet ws = wb.getSheetAt(0);

		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);

		int cellCount = ws.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
			}
		}
		
		wb.close();
		return data;

	}

}


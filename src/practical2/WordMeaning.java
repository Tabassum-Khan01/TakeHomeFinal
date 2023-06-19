//Read each word and its possible meaning.
//Print them out

package practical2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WordMeaning {

	public static void main(String[] args) {
		String filePath = "src/Data/Dictionary.xlsx";

		try (FileInputStream inputFile = new FileInputStream(filePath); 
			Workbook wb = new XSSFWorkbook(inputFile)) {
			Sheet sheet = wb.getSheetAt(0);

			for (Row row : sheet) {
				for (Cell cell : row) {
					CellType cellType = cell.getCellType();
					switch (cellType) {
					case STRING:
						System.out.println(cell.getStringCellValue() + "\t");
						break;
					default:
						break;
					}
					
				}
				System.out.println();
			}
			inputFile.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}

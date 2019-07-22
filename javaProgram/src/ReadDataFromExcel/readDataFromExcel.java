package ReadDataFromExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
		File fi = new File("C:\\Users\\Me\\Desktop\\webDriverJar\\project\\javaProgram\\src\\ReadDataFromExcel\\testData.xlsx");
		FileInputStream finput = new FileInputStream(fi);
		System.out.println("sadhana");
		XSSFWorkbook wbook = new XSSFWorkbook(finput);
		 XSSFSheet sheet = wbook.getSheetAt(0);
		 Iterator<Row> rowItr = sheet.iterator();
		 
		 while(rowItr.hasNext())
		 {
			 Row row = rowItr.next();
			 Iterator<Cell> cellItr = row.cellIterator();
			 while(cellItr.hasNext())
			 {
				  Cell cell =cellItr.next();
				  switch(cell.getCellType())
				  {
				  case NUMERIC:
					  System.out.println(cell.getNumericCellValue());
					  break;
					  
				  case STRING:
					  System.out.println(cell.getStringCellValue() );
					  break;
				default:
					break;
				  }
			 }
			 System.out.println("");
		 }
		 finput.close();
	}

}


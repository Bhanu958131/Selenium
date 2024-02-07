package dataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\testdata\\data.xlsx");
		
		XSSFWorkbook work=new XSSFWorkbook(file);

		XSSFSheet sheet=work.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("total rows" +rows);
		System.out.println("total cells" +cells);
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
					
			for(int c=0;c<cells;c++)
			{
				//XSSFCell cell=currentRow.getCell(c);
				//String value=cell.toString();
				String value=currentRow.getCell(c).toString();
				System.out.print(value+"      ");
			}
			System.out.println();
		}
		
		work.close();
		file.close();
		
	}

}

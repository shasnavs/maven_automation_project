package utilitiespkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Storenvyutilities {
	
	public static String getCellValue(String xl,String sheet,int r,int c)
	{
		try
		{
			FileInputStream fi= new FileInputStream(xl);
			try (XSSFWorkbook w = new XSSFWorkbook(fi)) {
				XSSFCell cell= w.getSheet(sheet).getRow(r).getCell(c);
				if(cell.getCellType()==CellType.STRING)
				{
					return cell.getStringCellValue();
				}
				else
				{
					return cell.getRawValue();
				}
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}

	
	public static int getRowCount(String xl,String sheet)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xl);
			try (XSSFWorkbook w = new XSSFWorkbook(fi)) {
				return w.getSheet(sheet).getLastRowNum();
			}
		}
		catch(Exception e)
		{
			return 0;
		}
	}

}



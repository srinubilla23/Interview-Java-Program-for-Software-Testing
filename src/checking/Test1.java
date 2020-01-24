package checking;

import java.io.File;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Test1 
{
  @Test
  public static void main(String[] arg) throws Exception
  {
	  File f=new File("F:\\EclipseProject\\ex.xlsx");
	  Workbook wb1=Workbook.getWorkbook(f);
	  Sheet sh1=wb1.getSheet(0);
	  int row1=sh1.getRows();
	  int col1=sh1.getColumns();
	  
	  File f2=new File("F:\\EclipseProject\\ex.xlsx");
	  Workbook wb2=Workbook.getWorkbook(f2);
	  Sheet sh2=wb2.getSheet(1);
	  int row2=sh2.getRows();
	  int col2=sh2.getColumns();
	  
	  WritableWorkbook wb3=Workbook.createWorkbook(f);
	  WritableSheet sh3=wb3.getSheet(0);
	  WritableSheet sh4=wb3.getSheet(1);
  }
  
}

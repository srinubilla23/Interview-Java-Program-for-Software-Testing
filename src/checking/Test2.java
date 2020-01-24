package checking;


import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
 
public class Test2 {

	public static void main(String[] args) throws Exception 
	{ 
		
		  Workbook wb1=Workbook.getWorkbook(new File("C:\\Users\\Srinivas K\\Downloads\\Test.xls"));
		  Sheet sh1=wb1.getSheet(0);
		  int row1=sh1.getRows();
		 	 	  
		  WritableWorkbook wb3=Workbook.createWorkbook(new File("C:\\Users\\Srinivas K\\Downloads\\Testcopy.xls"), wb1);
		  WritableSheet sh3=wb3.getSheet(0);
		  
		  for (int i=0; i<row1; i++)
		  {
			  int x=Integer.parseInt(sh1.getCell(0,i).getContents());
			  int y=Integer.parseInt(sh1.getCell(i,1).getContents());
			  int z=x+y;
			  Number n=new Number(2,i,z);
			  sh3.addCell(n);
		  }
		  wb3.write();
		  wb1.close();
		  wb3.close();
		  /*
		select s =new select(e);
		Action a=new Action(driver);
		a.keysDown(keys.control).click(s.getoptions().get(1)).click(s.getoptions().get(2)).build().perform();	
		 */  
		  
	
	}

}

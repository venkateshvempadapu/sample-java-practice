package package1;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class JXL {
	
	

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
	

				
				File f=new File("G:\\Selenium_Practice\\Excel_Practice\\SaiTeja.xls");
				Workbook rwb= Workbook.getWorkbook(f);
				
				Sheet rsh=rwb.getSheet(0);
				
				int  nour=rsh.getRows();
				WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
				WritableSheet wsh=wwb.getSheet(0);
				
						
						for(int i=1; i<nour;i++)
						{
						
							int x=Integer.parseInt(rsh.getCell(0,i).getContents());
							
							int y=Integer.parseInt(rsh.getCell(1,i).getContents());
							
							int a=Integer.parseInt(rsh.getCell(2,i).getContents());
							
							int z=x+y+a;
							
							jxl.write.Number n= new jxl.write.Number(3, i, z);
							 
							wsh.addCell(n);
						
						}
						
						wwb.write();
						rwb.close();
						wwb.close();
						
						
						System.out.println("It's Done");
						
						}
	
	
	
				

	}



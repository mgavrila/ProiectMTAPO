package Services;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ImportService 
{
	static FileInputStream fileInputStream ;
	static HSSFWorkbook workbook;
	static HSSFSheet profesori_wk;
	static HSSFSheet student_wk;
	
	public static boolean doImport(FileInputStream file){
		if(file == null)
			return false;
		
		boolean done = false;
		
		try{
			workbook = new HSSFWorkbook(file);
			profesori_wk = workbook.getSheet("Profesori");			
			student_wk = workbook.getSheet("studenti");		
			done = true;
			
			deleteProfesori();
			deleteStudent();
			addProfesori();
			addStudent();
			
		}catch(IOException e){
			e.printStackTrace();
		}			
		return done;
	}
	
	
		public static void addProfesori()
		{
		
		for(int j = 1; j<=profesori_wk.getLastRowNum(); j++)
		{
			
			HSSFRow row1 = profesori_wk.getRow(j);
			HSSFCell cellA1 = row1.getCell((short) 0);	
			String nume_profesor = cellA1.getStringCellValue();
						
		ProfesorService.addProfesor(nume_profesor);
		}
	}
		
		public static void addStudent()
		{
			for(int n = 1; n<=student_wk.getLastRowNum(); n++)
			{
			HSSFRow row1 = student_wk.getRow(n);
			
			
			HSSFCell cellA1 = row1.getCell((short) 0);	
			String nume_student = cellA1.getStringCellValue();
			
			HSSFCell cellB1 = row1.getCell((short) 1);	
			int an_studiu = (int) cellB1.getNumericCellValue();
			
			StudentService.addStudent(nume_student, an_studiu);
			
			}
		}
		
		public static void deleteStudent()
		{
			StudentService.deleteAllFromTable();		
		}
		
		public static void deleteProfesori()
		{	
			ProfesorService.deleteAllFromTable();		
		}
}

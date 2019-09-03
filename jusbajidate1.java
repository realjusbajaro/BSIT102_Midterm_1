import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
 
public class jusbajidate1 {
    
    public static void main(String[] args) throws Exception {
    	Date date = new Date();
    	SimpleDateFormat format = new SimpleDateFormat ("dd-M-yyyy");
    	Calendar calendar = new GregorianCalendar();
    	
    	Scanner baj = new Scanner(System.in);
    	
    	
    	System.out.print("Input Date: ");
    	String input_bday = baj.nextLine();
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = year - byear;
    	
    	System.out.println("My age is " + age);
    
    	
    
    }
}

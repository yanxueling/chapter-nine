import java.util.GregorianCalendar;
public class SimpleGregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.print(calendar.get(GregorianCalendar.YEAR)+"/"+calendar.get(GregorianCalendar.MONTH)+"/"+calendar.get(GregorianCalendar.DAY_OF_MONTH)+"\n");
		
		calendar.setTimeInMillis(1234567898765L);
		System.out.print(calendar.get(GregorianCalendar.YEAR)+"/"+calendar.get(GregorianCalendar.MONTH)+"/"+calendar.get(GregorianCalendar.DAY_OF_MONTH)+"\n");
		
	}

}

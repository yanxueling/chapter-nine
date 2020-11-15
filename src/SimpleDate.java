public class SimpleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Date date = new java.util.Date();
		 
		for(int i =1;i<=8;i++) {
			long time = 1000 * (long)Math.pow(10, i);
			date.setTime(time);
			System.out.println(date.toString());
		}
		

	}

}
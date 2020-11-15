
public class TestStopWatch {
 
	final static int N = 1000;
	
	public static void main(String [] args) {
	StopWatch s = new StopWatch();
	s.start();
	int [] array = new int [N];
	for(int i =0;i<N;i++) {
		array[i]=(int)(Math.random()*100000);
	}
	range(array);
	s.stop();
	System.out.println("Time is "+s.getElapsedTime());
	}
	
	public static void range(int [] arr) {
		
		int temp;
		for(int i =0;i<N;i++)
			for(int j =i+1;j<N;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		
	}
}


 class StopWatch{
	
	private long startTime;
	private  long endTime;
	
	 StopWatch(){
		
		startTime = System.currentTimeMillis();
	}
	
	public  void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
		
	}
	public long getElapsedTime() {
		return endTime-startTime;
	}
	
}
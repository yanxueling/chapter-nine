import java.util.Random;

public class SimpleRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1 = new Random(1000);

		for(int i =0;i<50;i++) {
			System.out.print(random1.nextInt(100)+" ");
			if(i>9 && i%10==0)
				System.out.println();
		}
	}

}
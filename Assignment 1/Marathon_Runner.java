import java.util.Scanner;

public class Marathon_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a starting distance (between 5 to 8 km)");
		int n = sc.nextInt();
		while (n <5 || n > 8)
		{
			System.out.println("Sorry, choose between 5km to 8km");
			System.out.println("Enter a starting distance (between 5 to 8 km)");
			n = sc.nextInt();
		}
		System.out.println("Distance to run:"+n);
		System.out.println("Distance to run:"+(n-1));
		System.out.println("Good start, Keep it up");
		for (int i = n-2; i >0; i--)
		{
			System.out.println("Distance to run:"+i);
			if (i < 3)
				System.out.println("Almost There!"); 
	
		}
		System.out.println("Done for the day");
		

	}

}

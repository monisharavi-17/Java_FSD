import java.util.Arrays;
import java.util.Scanner;

public class third {
    static int[] arr = new int[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0; 
		int sum2 = 0;
		for (int i = 0; i<n; i++)
		{
			sum += arr[i];
			sum2 = 0;
			for (int j = i+1; j < n; j++)
				sum2 += arr[j]; 
			
			if (sum == sum2)
			{
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
		
		
		

	}

}

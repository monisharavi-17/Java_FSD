import java.util.Scanner;

public class fourth {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int steps = 0;
		int i = 0;
		int count = 0;
		if (arr[0] == 0)
		{
			System.out.println("-1");
			return;
		}
		while (true)
		{
			steps = arr[i];
			int max = 0;
			int k = 0;
			if (i+arr[i] < n)
				k = i+arr[i];
			else
				break;
			for (int j = i; j <i+arr[i]; j++)
			{
				if (arr[j] > max)
					max = arr[j];
			}
			//System.out.println(max);
			i += max;
			if (i >= n)
				break; 
			count += 1;
		}
		System.out.println(count+1);
		
	}
}

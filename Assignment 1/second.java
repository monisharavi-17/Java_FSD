import java.util.Scanner;

public class second {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[50];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();	
		}
		int maxsum = -999;

		for (int i = 1; i < n; i++)
		{
			for (int j = 0; j <n; j++)
			{
				int sum = 0;
				if (i+j <= n)
				{
					for (int k = j; k < i+j; k++)
					{
						//System.out.print(arr[k]+" ");
						sum += arr[k];
					}
					//System.out.println(sum);
					if (sum > maxsum)
					{
						maxsum = sum;
					}
				}
			}
			//System.out.println(sum);
		}
		System.out.println(maxsum);
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class fifth {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] arr = new String[n][n];
		for (int i = 0; i < n; i++)
		{
			
			String firstname = sc.next();
			String lastname = sc.next();
			arr[i][0] = firstname;
			arr[i][1] = lastname;
		}
//		for (int i = 0; i < n; i++)
//		{
//			System.out.println(arr[i][0]+" "+arr[i][1]);
//		}
		for (int i = 0; i < n; i++)
		{
			for (int j = i+1; j <n; j++)
			{
				if (arr[i][0].compareTo(arr[j][0]) > 0)
				{
					String[] temp = arr[i];
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
				else if (arr[i][0].compareTo(arr[j][0]) == 0)
				{
					if (arr[i][1].compareTo(arr[j][1]) > 0)
					{
						String[] temp = arr[i];
						arr[i] = arr[j]; 
						arr[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}
}

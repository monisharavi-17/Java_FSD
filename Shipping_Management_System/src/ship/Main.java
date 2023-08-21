package ship;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("******************WELCOME TO SHIP MANAGEMENT SYSTEM**********************");
		System.out.println("Enter Specific Number to Login");
		System.out.println("1 - PortManager");
		System.out.println("2 - Ship Manager");
		System.out.println("3 - Material Manager");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String username = sc.next();
		String password = sc.next();
		if (num == 1)
		{
			if (username.equals("xyz") && password.equals("hi"))
			{
				System.out.println("Login Successgful.");
				Port p1 = new Port();
			
			}
			else
			{
				System.out.println("Incorrect Username or password");
			}
		}
		else if (num == 2)
		{
			if (username.equals("ship123") && password.equals("abcdefg"))
			{
				System.out.println("Login Successgful.");
				Ship s1 = new Ship();
			}
			else
			{
				System.out.println("Incorrect Username or password");
			}
		}
		else if (num == 3)
		{
			if (username.equals("material123") && password.equals("abcdefg"))
			{
				System.out.println("Login Successgful.");
				Container c1 = new Container();
			}
			else
			{
				System.out.println("Incorrect Username or password");
			}
		}
		
		

	}

}

package ship;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class chennai
{
	chennai() throws IOException
	{
		int flag = 0;
		System.out.println("The ships present in Chennai port are:");
		File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		FileReader fr=new FileReader(file);    
		BufferedReader br=new BufferedReader(fr); 
		String line;  
		while((line=br.readLine())!=null)  
		{  
		     String b[] = line.split(" ");
		     if (b[1].equals(b[2]))
		     {
		    	 if (b[1].equals("chennai"))
		    	 {
		    		 flag = 1;
		    		 System.out.println(b[0]+" is in chennai port");
		    	 }
		   	 }
		}     
		if (flag == 0)
			System.out.println("Currently ships are not in Chennai port");
	}
}
class mumbai
{
	mumbai() throws IOException
	{
		int flag = 0;
		System.out.println("The ships present in Mumbai port are:");
		File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		FileReader fr=new FileReader(file);    
		BufferedReader br=new BufferedReader(fr); 
		String line;  
		while((line=br.readLine())!=null)  
		{  
		     String b[] = line.split(" ");
		     if (b[1].equals(b[2]))
		     {
		    	 if (b[1].equals("mumbai"))
		    	 {
		    		 flag = 1;
		    		 System.out.println(b[0]+" is in mumbai port");
		    	 }
		   	 }
		}     
		if (flag == 0)
			System.out.println("Currently ships are not in Mumbai port");
	}
}

class kochi
{
	kochi() throws IOException
	{
		int flag = 0;
		System.out.println("The ships present in Kochi port are:");
		File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		FileReader fr=new FileReader(file);    
		BufferedReader br=new BufferedReader(fr); 
		String line;  
		while((line=br.readLine())!=null)  
		{  
		     String b[] = line.split(" ");
		     if (b[1].equals(b[2]))
		     {
		    	 if (b[1].equals("kochi"))
		    	 {
		    		 flag = 1;
		    		 System.out.println(b[0]+" is in kochi port");
		    	 }
		   	 }
		}     
		if (flag == 0)
			System.out.println("Currently ships are not in Kochi port");
	}
}
public class Port {
    public Port() throws IOException
    {
    	System.out.println("Welcome to Port Management");
    	System.out.println("1.View Available Ports"); 
    	System.out.println("2.Exit");  
    	main(null);

    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
		if (sc.nextInt() == 1)
		{
			System.out.println("1-Chennai Port");
			System.out.println("2-Mumbai Port"); 
			System.out.println("3-Kochi Port");
			System.out.println("TO SEE DETAILS ABOUT PARTICULAR PORT TYPE NUMBER"); 
			int num = sc.nextInt();
			if (num == 1)
			{
				chennai c1 = new chennai();
			}
			if (num == 2)
			{
				mumbai m1 = new mumbai();
			}
			if (num == 3)
			{
				kochi k1 = new kochi();
			}
		}
		
    	

	}

}

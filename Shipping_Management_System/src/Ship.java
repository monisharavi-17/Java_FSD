package ship;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface ships
{
	void add();
}
class updateship
{
	void update() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of ship you want to update");
		String name = sc.next();
		System.out.println("Update reached destination"); 
		String reached = sc.next();
		if (name.equals("ShipA"))
		{
			 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
			fileContent.set(0, "ShipA"+" "+reached+" "+reached);
			 
			  
			Files.write(myPath, fileContent, StandardCharsets.UTF_8);
		}
		else if (name.equals("ShipB"))
		{
			 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
			fileContent.set(1, "ShipB"+" "+reached+" "+reached);
			 
			  
			Files.write(myPath, fileContent, StandardCharsets.UTF_8);
		}
		else if (name.equals("ShipC"))
		{
			 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
			fileContent.set(2, "ShipC"+" "+reached+" "+reached);
			 
			  
			Files.write(myPath, fileContent, StandardCharsets.UTF_8);
		}
		else if (name.equals("ShipD"))
		{
			 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
			fileContent.set(3, "ShipD"+" "+reached+" "+reached);
			 
			  
			Files.write(myPath, fileContent, StandardCharsets.UTF_8);
		}

		}
		
	}

class trackships
{
	trackships()
	{
		try {
		File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		FileReader fr=new FileReader(file);    
		BufferedReader br=new BufferedReader(fr);    
		String line;  
		String a[] = null;
		while((line=br.readLine())!=null)  
		{  
		     String b[] = line.split(" ");
		     if (b.length == 3)
		     {
		    	 if (b[1].equals(b[2]))
		    	 System.out.println(b[0]+" is in "+b[1]);
		    	 else
		    	 System.out.println(b[0]+" is travelling from "+b[1]+" to "+b[2]);
		     }
		}  
		br.close();
		fr.close();     
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
		
	}
}
class ShipA implements ships
{
	ShipA()
	{
		System.out.println("Ship A carries Basic Containers");	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		try  
		{  
		int maxweight = 1000;
		int current = 0;
		File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\Basic_Container.txt");
		File tempfile = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\tempfile");
		File f = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		FileWriter writer1 = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));
		FileReader fr=new FileReader(file);    
		BufferedReader br=new BufferedReader(fr);    
		String line;  
		ArrayList<String> shipcarries = new ArrayList<String>();
		String a[] = null;
		int flag = 0;
		String source="";String dest="";
		 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		 List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
		 String src[] = fileContent.get(0).split(" ");
		 source = src[1]; 
		
		while((line=br.readLine())!=null)  
		{  
		     String b[] = line.split(" ");
		     if (flag == 0)
		     {   System.out.println(current);
		    	 current += Integer.parseInt(b[2]);
		    	 System.out.println(current);
			     if (b[4].equals(source) && (current)<maxweight)
			     {
			    		 dest = b[5]; 
			    	 	shipcarries.add(b[0]);
			    	 	//System.out.println("yes");
			     }
			     else
			     {
			    	 writer.write(line); 
			    	 //System.out.println(line);
			     }
			     flag = 1;
		     }
		     else 
		     {
		    	 current += Integer.parseInt(b[2]);
		    	 if (b[4].equals(source) && b[5].equals(dest)&& current < maxweight)
			     { 
			    	 	shipcarries.add(b[0]);
			    	 	//System.out.println("yes");
			     }
			     else
			     {
			    	 writer.write(line); 
			    	 //System.out.println(line);
			     }
			     flag = 1;
		     }
		}  
		if (flag == 1)
		{
			 Path myPath1 = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
				List<String> fileContent1 = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
				fileContent1.set(0, "ShipA"+" "+source+" "+dest);
				//System.out.println("hihihi");
				 
				  
				Files.write(myPath1, fileContent1, StandardCharsets.UTF_8);
		}
		System.out.println(shipcarries.toString());
		writer.close();
		writer1.close();
		br.close();
		fr.close();     
		file.delete();
		tempfile.renameTo(file);
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
		
	}
	
	
}
class ShipB implements ships
{
	ShipB()
	{
		System.out.println("Ship B carries Heavy Containers");	
	}

	@Override
	public void add() {
		try  
		{  
		int maxweight = 3000;
		int current = 0;
		File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\Heavy_Container.txt"); 
		File tempfile = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\tempfile");
		File f = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		FileWriter writer1 = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));
		FileReader fr=new FileReader(file);    
		BufferedReader br=new BufferedReader(fr);    
		String line;  
		ArrayList<String> shipcarries = new ArrayList<String>();
		String a[] = null;
		int flag = 0;
		String source="";String dest="";
		 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
		 List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
		 String src[] = fileContent.get(1).split(" ");
		 source = src[1]; 
		
		while((line=br.readLine())!=null)  
		{  
		     String b[] = line.split(" ");
		     current += Integer.parseInt(b[2]);
		     if (flag == 0)
		     {
			     if (b[4].equals(source) && current < maxweight)
			     {
			    	 
			    		 dest = b[5]; 
			    	 	shipcarries.add(b[0]);
			    	 	//System.out.println("yes");
			     }
			     else
			     {
			    	 writer.write(line); 
			    	 //System.out.println(line);
			     }
			     flag = 1;
		     }
		     else 
		     {
		    	 if (b[4].equals(source) && b[5].equals(dest) && current < maxweight)
			     { 
			    	 	shipcarries.add(b[0]);
			    	 	//System.out.println("yes");
			     }
			     else
			     {
			    	 writer.write(line); 
			    	 //System.out.println(line);
			     }
			     flag = 1;
		     }
		}  
		if (flag == 1)
		{
			 Path myPath1 = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
				List<String> fileContent1 = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
				fileContent1.set(1, "ShipB"+" "+source+" "+dest);
				 
				  
				Files.write(myPath1, fileContent1, StandardCharsets.UTF_8);
		}
		writer.close();
		writer1.close();
		br.close();
		fr.close();     
		file.delete();
		tempfile.renameTo(file);
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
		
		
		
		
		
	}
}	

class ShipC implements ships
{
	ShipC()
	{
		System.out.println("Ship C carries liquid containers");	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		try
		{  
			int maxweight = 1000;
			int current = 0;
			File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\Liquid_Container.txt");
			File tempfile = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\tempfile");
			File f = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			FileWriter writer1 = new FileWriter(f,true);
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));
			FileReader fr=new FileReader(file);    
			BufferedReader br=new BufferedReader(fr);    
			String line;  
			ArrayList<String> shipcarries = new ArrayList<String>();
			String a[] = null;
			int flag = 0;
			String source="";String dest="";
			 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			 List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
			 String src[] = fileContent.get(2).split(" ");
			 source = src[1]; 
			
			while((line=br.readLine())!=null)  
			{  
			     String b[] = line.split(" ");
			     current += Integer.parseInt(b[2]);
			     if (flag == 0)
			     {
				     if (b[4].equals(source) && current < maxweight)
				     {
				    		 dest = b[5]; 
				    	 	shipcarries.add(b[0]);
				    	 	//System.out.println("yes");
				     }
				     else
				     {
				    	 writer.write(line); 
				    	 //System.out.println(line);
				     }
				     flag = 1;
			     }
			     else 
			     {
			    	 if (b[4].equals(source) && b[5].equals(dest) && current < maxweight)
				     { 
				    	 	shipcarries.add(b[0]);
				    	 	//System.out.println("yes");
				     }
				     else
				     {
				    	 writer.write(line); 
				    	 //System.out.println(line);
				     }
				     flag = 1;
			     }
			}  
			if (flag == 1)
			{
				 Path myPath1 = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
					List<String> fileContent1 = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
					fileContent1.set(2, "ShipC"+" "+source+" "+dest);
					 
					  
					Files.write(myPath1, fileContent1, StandardCharsets.UTF_8);
			}
			writer.close();
			writer1.close();
			br.close();
			fr.close();     
			file.delete();
			tempfile.renameTo(file);
			}  
			catch(IOException e)  
			{  
			e.printStackTrace();  
			}  
			
			
			
		
		
	}
	
}
class ShipD implements ships
{
	ShipD()
	{
		System.out.println("Ship D carries Liquid Containers");	
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		try
		{  
			int maxweight = 1000;
			int current = 0;
			File file = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\Refridge_Container.txt");
			File tempfile = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\tempfile");
			File f = new File("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			FileWriter writer1 = new FileWriter(f,true);
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));
			FileReader fr=new FileReader(file);    
			BufferedReader br=new BufferedReader(fr);    
			String line;  
			ArrayList<String> shipcarries = new ArrayList<String>();
			String a[] = null;
			int flag = 0;
			String source="";String dest="";
			 Path myPath = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
			 List<String> fileContent = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
			 String src[] = fileContent.get(0).split(" ");
			 source = src[1]; 
			
			while((line=br.readLine())!=null)  
			{  
			     String b[] = line.split(" ");
			     current += Integer.parseInt(b[2]);
			     if (flag == 0)
			     {
				     if (b[4].equals(source) && current < maxweight)
				     {
				    		 dest = b[5]; 
				    	 	shipcarries.add(b[0]);
				    	 	//System.out.println("yes");
				     }
				     else
				     {
				    	 writer.write(line); 
				    	 //System.out.println(line);
				     }
				     flag = 1;
			     }
			     else 
			     {
			    	 if (b[4].equals(source) && b[5].equals(dest) && current < maxweight)
				     { 
				    	 	shipcarries.add(b[0]);
				    	 	//System.out.println("yes");
				     }
				     else
				     {
				    	 writer.write(line); 
				    	 //System.out.println(line);
				     }
				     flag = 1;
			     }
			}  
			if (flag == 1)
			{
				 Path myPath1 = Paths.get("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\ship.txt");
					List<String> fileContent1 = new ArrayList<>(Files.readAllLines(myPath, StandardCharsets.UTF_8));
					fileContent1.set(0, "ShipA"+" "+source+" "+dest);
					 
					  
					Files.write(myPath1, fileContent1, StandardCharsets.UTF_8);
			}
			writer.close();
			writer1.close();
			br.close();
			fr.close();     
			file.delete();
			tempfile.renameTo(file);
			}  
			catch(IOException e)  
			{  
			e.printStackTrace();  
			}  
			
			
		
		
	}
	
}

public class Ship {
    Ship() throws IOException
    {
    	System.out.println("Welcome to Ship Management");
    	System.out.println("1.View All the Ships"); 
    	System.out.println("2.Add container to ship");
    	System.out.println("3.Track Ship");  
    	System.out.println("4.Update Status of ship");
    	main(null);
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1)
		{
			System.out.println("1. Ship A");
			System.out.println("2. Ship B");
			System.out.println("3. Ship C");
			System.out.println("4. Ship D");
			
		}	
		else if(n == 2)
		{
			System.out.println("Choose Serial number of ship to add containers");
			int number = sc.nextInt();
			if (number == 1)
			{	
			ShipA a = new ShipA();
		    a.add();
			}
			else if (number == 2)
			{
			ShipB b = new ShipB();
			b.add();
			}
			else if (number == 3)
			{
			ShipC c = new ShipC();
			c.add();
			}
			else if (number == 4)
			{
			ShipD d = new ShipD();
			d.add();
			}
		}
		else if (n==3)
		{
			trackships t1 = new trackships();
		}
		else if (n==4)
		{
			updateship u1 = new updateship();
			u1.update();
		}
		

	}

}
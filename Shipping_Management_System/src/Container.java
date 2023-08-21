package ship;

import java.util.Scanner;
abstract class add_container
{
	String name;
	int height;
	int weight;
	int width;
	String property="";
	String src = " ";
	String dest = " ";
	add_container(String name,int height,int weight,int width,String property,String src, String dest)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.width = width;
		this.property = property;
		this.src = src; 
		this.dest = dest;
	}
	
}
class add_container1 extends add_container
{

	add_container1(String name,int height, int weight, int width,String property,String src,String dest) {
		// TODO Auto-generated constructor stub
		super(name,height, weight, width,property,src,dest); 
		if (property.equals("frozen"))
		{
			RefridgiratedContainer r1 = new RefridgiratedContainer(name,height,weight,width,src,dest);
		}
		else if (property.equals("liquid"))
		{
			Liquid_Container l1 = new Liquid_Container(name,height,weight,width,src,dest);
		}
		else if (height > 5 || weight > 150 || width > 5)
		{
			Heavy_container h1 = new Heavy_container(name,height,weight,width,src,dest);
		}
		else
		{
			//System.out.println("hi");
			BasicContainer b1 = new BasicContainer(name,height,weight,width,src,dest);
		}
			
}
}
public class Container {

	Container()
	{
		System.out.println("Welcome to Container Management");
		System.out.println("Enter your choice");
    	System.out.println("1.Add Containers"); 
    	main(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("How many containers you want to add");
		int freq = sc.nextInt();
		for (int i = 0; i < freq; i++)
		{
		if (num == 1)
		{
			System.out.println("Enter container name");
			String name = sc.next(); 
			System.out.println("Enter Heigth in meters");
			int height = sc.nextInt();
			System.out.println("Enter weight in kgs");
			int weight = sc.nextInt();
			System.out.println("Enter width in meters");
			int width = sc.nextInt();
			System.out.println("Enter property");
			String property = sc.next();
			System.out.println("Enter From");
			String src = sc.next();
			System.out.println("Enter Destination");
			String dest = sc.next();
			add_container1 a1 = new add_container1(name,height,weight,width,property,src,dest);
			System.out.println("Generating Bill");
			Generate_Bill b1 = new Generate_Bill(name,height,weight,width,property,src,dest);
		}
		}
		

	}

}

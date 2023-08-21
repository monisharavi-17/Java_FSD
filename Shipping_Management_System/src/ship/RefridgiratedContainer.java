package ship;

import java.io.FileWriter;
import java.io.IOException;

public class RefridgiratedContainer {

	RefridgiratedContainer(String name, int height, int weight, int width,String src, String dest)
	{
		try {
			  System.out.println("Hi");
		      FileWriter myWriter = new FileWriter("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\Refridge_Container.txt",true);
		      myWriter.write("\n");
		      myWriter.write(name+" "+height+" "+weight+" "+width+" "+src+" "+dest);
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

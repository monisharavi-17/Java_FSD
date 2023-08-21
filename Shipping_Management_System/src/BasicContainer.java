
package ship;
import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.IOException;
public class BasicContainer {

	BasicContainer(String name,int height, int weight, int width, String src, String dest)
	{
		try {
		      FileWriter myWriter = new FileWriter("D:\\JAVAFSD\\SHIP_MANAGEMENT_SYSTEM\\src\\ship\\Basic_Container.txt",true);
		      //BufferedWriter myWriter = new BufferedWriter(fr);
		      myWriter.write(name+" "+height+" "+weight+" "+width+" "+src+" "+dest);
		      myWriter.write("\n");
		      System.out.println("Successfully added container");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}
}
		



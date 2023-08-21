package ship;

public class Generate_Bill {
    static int total = 0;
    static int basic = 150;
    static int heavy = 300; 
    static int liquid = 350;
    static int frozen = 500;
	Generate_Bill(String name,int height ,int weight,int width, String property, String src, String dest)
	{
		if (weight < 150)
		{
			total = weight*basic;
		}
		else if (property.equals("liquid"))
		{
			total = weight*liquid;
		}
		else if (property.equals("frozen"))
		{
			total = weight*frozen;
		}
		else if (weight > 150)
		{
			total = weight*heavy;
		}
		System.out.println("The Bill for weight "+weight+" kgs is "+total);
	}

}

package evan.beans;

public class carmain 
{
public static void main(String[] arf)
{
	Car c= new Car();
	c.setCarid(1);
	c.setCarmodel("BMW");
	c.setCarname("chandra car");
	
	System.out.println(c.getCarid());
	System.out.println(c.getCarname());
	System.out.println(c.getCarmodel());
	
}
}

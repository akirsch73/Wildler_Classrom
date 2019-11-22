public class Wilder1 
{
	private String firstname;
	private boolean present; 

	public Wilder1 (String firstname, boolean present)
	{
		this.firstname=firstname;
		this.present=present;
	}
	/*public void setfirstname (String firstname) 
	{
		this.firstname=firstname;
	}
	public void setpresent (boolean present)
	{
		this.present=present;
	}
	public String getfirstname() 
	{
		return this.firstname;
	}
	public boolean ispresent()
	{
		return this.present;
	}
	*/
	public String toString ()
	{
		return this.firstname + " " + this.present;
	}
	public void setfirstname (String firstname) 
	{
		this.firstname=firstname;
	}
	public String getfirstname() 
	{
		return this.firstname;
	}
	public boolean ispresent()
	{
		return this.present;
	}
	public String firstnameAndPresent () 
	{
		return "My name is " + this.getfirstname() + " " + this.ispresent();			
	}

	
	public String WhoIAm()
	/*public static void main (String[] args)*/	
	{

	
	
	/*	fifi.setfirstname("fufu");
		System.out.println (varperson +" , "+fifi);
	*/

		boolean present = this.ispresent();
		if (present == false)
		{
		return /* 	System.out.println (*/ "My name is " + this.getfirstname() + " and I am not present." /*)*/;
		}
		else
		{
		return /*System.out.println (*/"My name is " + this.getfirstname() + " and I am present."/*)*/;
		}
	}
}


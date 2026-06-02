package switchstmt;
//print the 7 divible by number range 150-250
class Example
{
private int x,	y ;
	public void read()
	 {
	x=150;
	y=250;
	 }
	public void print()
	{
		while( x <= y)	        
	  {
		if (x % 7 == 0)		
		{
			System.out.println(x);	
		}
		x++;
	  }
	} 

//	public void print()
//	 {
//	do {
//	if(x % 7 == 0)
//	    	{
//	System.out.println(x);
//	 }
//	x++;
//	   }
// 	while(x <=y);
//		}
//	

}
class PrimeNUm
{
public static void main(String args[])
	{
	Example e= new Example();
	e.read();
	e.print();	
		
	}
}

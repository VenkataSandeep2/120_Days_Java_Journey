package explicit;

public class Test3 
{
	public static void main(String[] args) 
	
	{
		long l = 50000l;
		int num = (int) l;
		System.out.println("Long numer is -> "+l);
		System.out.println("Interger num is ->" +num);
		
		System.out.println("=================================");		
		long l1 = 500000000l;
		int num1 = (int) l;
		System.out.println("Long numer is -> "+l1);
		System.out.println("Interger num is ->" +num1);
		
		
		System.out.println("=================================");
		
		int i = 132;
		byte b = (byte)i;
		System.out.println("Integer value is -> "+i);
		System.out.println("Byte values is -> "+b );
	
	
	}


/*
          OUTPUT
          
          Long numer is -> 50000
          Interger num is ->50000
          =================================
          Long numer is -> 500000000
          Interger num is ->50000
          =================================
          Integer value is -> 132
          Byte values is -> -124
*/

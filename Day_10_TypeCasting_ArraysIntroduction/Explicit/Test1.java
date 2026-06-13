package explicit;

public class Test1 
{
	public static void main(String[] args) 
	{
		short s = 127;
		byte b = (byte) s;
		System.out.println(b);
		b++;
		System.out.println(b);
		++b;
		System.out.println(b);
		
	}

}


/*

Size is exceeded to loop cycle to go the -values

                          OUTPUT
              
                    127
                    -128
                    -127

*/

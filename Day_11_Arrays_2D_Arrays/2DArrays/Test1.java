package twoDarrays;

public class Test1 
{
	public static void main(String[] args) 
	{
		int [][] arr = new int[3][3];
		arr[0][0]= 1111;
		arr[0][1]= 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5555;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9999;
		
	//	System.out.println(arr);
		for(int i =0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + "      ");
			}
			System.out.println();
		}
	}

}

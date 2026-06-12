
public class SmallestNum 
{
	public static void main(String[] args) {
		int [] arr= {10,5,36,99,55,88,62,53,96,8,1,5,44,22,33,55,50};
		int min =arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min =arr[i];
			}
		}
		System.out.println(min);
		
	}

}

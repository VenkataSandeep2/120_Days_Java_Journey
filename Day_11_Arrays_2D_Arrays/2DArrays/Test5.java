package twoDarrays;

public class Test5 
/*
{
	public static void main(String[] args) {
		int [][] score= {
						{1,0,0,4,6},
						{0,1,1,4,0,6},
						{1,0,2},{0,2,4 },
						{2,1},{4,0},{1,0}
					};
		
		for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
	}

}

*/
{
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[]{10, 20, 30};
        arr[1] = new int[]{40, 50};
        arr[2] = new int[]{60, 70, 80, 90};
       // arr[3] = new int[] {20,5,230,55}; 		//ArrayIndexOutOfBoundsException

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

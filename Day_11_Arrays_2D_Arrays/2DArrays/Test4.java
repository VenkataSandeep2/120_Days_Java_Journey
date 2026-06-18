package twoDarrays;

public class Test4 
{
    public static void main(String[] args) 
    {

	        String[][] orders = {
	            {"Mobile", "Charger"},
	            {"Laptop"},
	            {"Mouse", "Keyboard", "Monitor"}
	        };

	        for(int i = 0; i < orders.length; i++) {
	            for(int j = 0; j < orders[i].length; j++) {
	                System.out.print(orders[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}



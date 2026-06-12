package practise;

public class Test4 
{
    public void checkVote(int age)
    {
        if(age >= 18)
        {
            System.out.println("Eligible for Vote");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }

    public static void main(String args[])
    {
        Test4 v = new Test4();

        v.checkVote(20);
        v.checkVote(15);
        v.checkVote(35);
        v.checkVote(21);
        v.checkVote(10);
    }
}

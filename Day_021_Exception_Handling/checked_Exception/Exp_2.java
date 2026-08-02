import java.io.FileReader;
import java.io.FileNotFoundException;

public class Exp_2
{
    public static void main(String[] args)
    {
        System.out.println("Program Started");

        try
        {
            FileReader file =
                new FileReader("student.txt");

            System.out.println("File Found");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }

        System.out.println("Program Completed");
    }
}

import java.io.IOException;

public class Application
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            DuplicateRemover diana = new DuplicateRemover();
            diana.remove("problem1.txt");
            diana.write("unique_words.txt");
        }
        catch (IOException err)
        {
            System.out.println("IOException was thrown. check your file name, it should be \"problem1.txt\". Also make sure the input file is in the directory directly above the folder named \"src\"");
            System.out.println(err);
        }
    }
}

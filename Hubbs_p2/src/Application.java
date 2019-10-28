import java.io.IOException;

public class Application
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            DuplicateCounter diana = new DuplicateCounter();
            diana.count("problem2.txt");
            diana.write("unique_word_counts.txt");
        }
        catch (IOException err)
        {
            System.out.println("IOException was thrown. check your file name, it should be \"problem2.txt\". Also make sure the input file is in the directory directly above the folder named \"src\"");
            System.out.println(err);
        }
    }
}

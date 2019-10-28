import java.io.*;
import java.util.ArrayList;

public class DuplicateRemover
{
    ArrayList<String> uniqueWords = new ArrayList<String>();

    public void remove(String dataFile) throws IOException
    {
        // System.out.println(dataFile);
        BufferedReader in = new BufferedReader(new FileReader(dataFile));
        String current = in.readLine();
        boolean banner = true;
        while (current != null)
        {
            for (int i = 0; i < uniqueWords.size(); i++)
            {
                // System.out.println("in for loop in remove(). i = " + i);
                if (current.equals(uniqueWords.get(i)))
                    banner = false;
            }
            if (banner)
                uniqueWords.add(current);
            current = in.readLine();
            banner = true;
        }
        in.close();
    }

    public void write(String outputFile) throws IOException
    {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        for (int i = 0; i < uniqueWords.size(); i++)
        {
            out.println(uniqueWords.get(i));
            // System.out.println(uniqueWords.get(i));
        }
        out.close();
    }
}

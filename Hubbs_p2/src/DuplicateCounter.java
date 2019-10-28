import java.io.*;
import java.util.ArrayList;

class Map
{
    ArrayList<String> words = new ArrayList<>();
    ArrayList<Integer> frequencies = new ArrayList<Integer>();
}

public class DuplicateCounter
{
    Map wordCounter = new Map();

    public void count(String dataFile) throws IOException
    {
        // System.out.println(dataFile);
        BufferedReader in = new BufferedReader(new FileReader(dataFile));
        boolean banner = true;
        String current = in.readLine();
        while (current != null)
        {
            for (int i = 0; i < wordCounter.words.size(); i++)
            {
                // System.out.println("in for loop in count(). i = " + i);
                if (current.equals(wordCounter.words.get(i)))
                {
                    // System.out.println("found duplicated word in for loop in count(). i = " + i);
                    wordCounter.frequencies.set(i, wordCounter.frequencies.get(i) + 1);
                    banner = false;
                }
            }
            if (banner)
            {
                // System.out.println("adding word: " + current);
                wordCounter.words.add(current);
                wordCounter.frequencies.add(1);
            }
            current = in.readLine();
            banner = true;
        }
        in.close();
    }

    public void write(String outputFile) throws IOException
    {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        for (int i = 0; i < wordCounter.words.size(); i++)
        {
            out.printf("%s appears %d times\n", wordCounter.words.get(i), wordCounter.frequencies.get(i));
            // System.out.printf("%s appears %d times\n", wordCounter.words.get(i), wordCounter.frequencies.get(i));
        }
        out.close();
    }
}

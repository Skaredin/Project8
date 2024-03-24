package lisen7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Админ/IdeaProjects/Project8_1/src/lisen4/numRez.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:/Users/Админ/IdeaProjects/Project8_1/src/lisen7/numRez.txt"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine())!=null)
            {
                lineCount++;
                System.out.println(lineCount +":"+s);
                out.write(s);
                out.newLine();
            }
        }catch (IOException e)
        {
            System.out.println("False");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

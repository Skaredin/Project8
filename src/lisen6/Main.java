package lisen6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:/Users/Админ/IdeaProjects/Project8_1/src/lisen4/numRez.txt");
            out = new FileWriter("C:/Users/Админ/IdeaProjects/Project8_1/src/lisen4/numRez.txt", true);

            int oneByte;
            while ((oneByte = in.read()) != -1) {

                out.write((char) oneByte);
                out.append((char) oneByte);
                System.out.print((char) oneByte);

            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();

        }
    }
}


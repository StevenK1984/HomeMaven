package org.lima.Filer;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class MainReaderStart {
    public static void main(String[] args) {
        String[] names1 = {"\nDavid", "_", "Simpson", "_", "Nelson"};
        String[] names2 = {"Unu", "Doi", "Trei"};
        String transporter1 = null;
        String transporter2 = null;

        {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                writer.write("Writing to a file.");
                writer.write("\nWriting another line to the file.");
                for (String name1:names1){
                    writer.write("" + name1);

                }
                for (String name2:names2){

                    writer.write("\n" + name2);
                    transporter2 = name2;
                }
                writer.write(transporter2);
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


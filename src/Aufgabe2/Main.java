package Aufgabe2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter testFile2 = new FileWriter("test2.txt");

        testFile2.write("1\n2\n3\n4\n5"); //entweter mit \n ein Linebreak erzeugen, dies funktioniert aber nurr
                                                // bei Windows.
                                                // mit System.getProperty("line.separator"); kann auch ein Umbruch erzeugt werden, dieser
                                                // auch bei anderes B.Systemen (Linux, macOS) verwenden, da dies den Umbruch befehl des B.S verwendet.
        System.getProperty("test2.txt");
        testFile2.close();


    }
}
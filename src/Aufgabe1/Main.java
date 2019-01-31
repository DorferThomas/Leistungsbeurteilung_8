package Aufgabe1;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File testFile = new File("test.txt");
        if (!testFile.exists())
        {
            testFile.createNewFile();
            System.out.println("Die test.txt Datei wurde erfolgreich erstellt! ");
        }else System.err.println("Die test.txt Datei war schon vorhanden! ");

        FileReader testReader = new FileReader("test.txt");
        BufferedReader bufferedReader = new BufferedReader(testReader); //falsch

        ArrayList<String> arrayList = new ArrayList<>();
        while (bufferedReader.ready())
        {
            arrayList.add(bufferedReader.readLine());
        }
                                                   /*
                                                            Why haut des ned hi????????????????????????????
                                                            for (int i = 0; i <= bufferedReader.read();i++)
                                                            {
                                                                arrayList.add(bufferedReader.readLine());
                                                            }
                                                   */
        for (String eintrag :arrayList)
        {
            System.out.println(eintrag);
        }

        //Aufgabe 2:
        //diese müssen geschlossen werden, weil ansonsten versucht er die ganze Zeit weiter zu lesen und findet nichts.
        //was unnötigen Rechnerpower verballat.
        bufferedReader.close();
    }
}

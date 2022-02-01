package org.example.myObserver;

import org.example.WR;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("test");
        try {
            File fileObj = new File("log.txt");
            FileWriter myWriter = new FileWriter("log.txt", true);
            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            }
            System.out.println("datei erstellt");

            myWriter.write("\n---------------------- LOG eintrag ----------------------\n");
            myWriter.write(arg.toString());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

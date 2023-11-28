package org.delicious.Model.IO;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public abstract class DataLoader
{

    public void load(String fileName){
        String data = "";
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                try {
                    data = myReader.nextLine();
                    parseAndLoadLine(data);
                }catch(NumberFormatException e){
                    System.out.printf("Found malformed data in %s.\n",fileName);
                    System.out.println(data);
                    e.printStackTrace();
                }catch (NullPointerException e){
                    System.out.printf("NullPointer%s.\n",fileName);
                    System.out.println(data);
                    e.printStackTrace();
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println(data);
            e.printStackTrace();
        }
    }

    public abstract void parseAndLoadLine(String data);
}

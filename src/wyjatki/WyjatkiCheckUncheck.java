package wyjatki;

import java.io.*;

public class WyjatkiCheckUncheck {
    public static void main(String[] args) {
        File file = new File("");

        //check exception
        // SQLException
        try{
        InputStream inputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
          e.printStackTrace();
            }

        // uncheck exception : NullPointerException, ArrayIndexOutOfBoundsException
    }
}

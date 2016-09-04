package utils;

import java.io.*;
import java.nio.file.FileSystemException;

/**
 * Created by Dyvak on 13.08.2016.
 */
public class Log {

    public static void log(String msg) throws FileSystemException{
        String fileName = "src/files/log_"+System.nanoTime()+".txt";
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            Writer writer = new OutputStreamWriter(outputStream);
            writer.write(msg);
        }catch (IOException e) {
            new File(fileName).delete();
            throw new FileSystemException("Some error during Log massage");
        }
    }
}

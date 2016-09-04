package utils;

import java.io.*;
import java.util.Date;

/**
 * Created by Dyvak on 13.08.2016.
 */
public class Log {

    public static void log(String msg) {

        final String FILE_NAME = "src/files/log.txt";

        try (FileWriter printWriter = new FileWriter(FILE_NAME, true)) {
            doTask(printWriter, msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(FileWriter writer, String msg) throws IOException {
        writer.write("Download from database: " + new Date() + "--------------->"+ msg + "\n");
        writer.close();
    }
}


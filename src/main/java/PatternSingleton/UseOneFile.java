package PatternSingleton;

import java.io.*;
import java.util.ArrayList;

public class UseOneFile {
    public static void bufferReadWrite(ArrayList s, File file){
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("\n");
            bufferWriter.write(String.valueOf(s));
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void bufferReadWrite(String s, File file){
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(String.valueOf("\n")+String.valueOf(s));
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

}

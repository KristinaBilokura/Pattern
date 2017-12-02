package PatternSingleton;

import java.io.File;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        UseOneFile file =new UseOneFile();
        File path = new File("new.txt");
        ArrayList<String> listSpain = new ArrayList<>();
        file.bufferReadWrite(singleton.message("Spain airports"),path);
        listSpain.add(singleton.message("Alicante Airport (formerly El Altet Airport) "));
        listSpain.add(singleton.message("Barcelona–El Prat Airport"));
        file.bufferReadWrite(listSpain,path);
        ArrayList<String> list = new ArrayList<>();
        file.bufferReadWrite(singleton.message("Airports of Ukraine"),path);
        list.add(singleton.message("Boryspil International Airport) "));
        list.add(singleton.message("Kiev (Zhuliany) International Airport"));
        list.add(singleton.message("Lviv Danylo Halytskyi International Airport"));
        file.bufferReadWrite(list,path);
    }

}

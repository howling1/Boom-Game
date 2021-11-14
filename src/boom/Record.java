package boom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Record {

    BufferedReader br;
    FileReader in;

    public Record() {

    }

    public String readLevel() {

        return "0";
    }

    public String readLevel4() {
        String s = "";
        int c;
        try {
            in = new FileReader("/record/level4.txt");
            br = new BufferedReader(in);
            while ((c = br.read()) != -1) {
                s = s + (char) c;
            }
            br.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}

package ch15_inout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try(FileWriter fiw = new FileWriter("/home/pc32/stuList/total.txt",true);) {

            String msg = "모해~~~~";
            fiw.write(msg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

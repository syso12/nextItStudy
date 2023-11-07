package ch15_inout;

import java.io.*;

public class ImageCopy {

    public static void main(String[] args) {
        File readImg = new File("/home/pc32/Downloads/dog.jpg");
        File writeImg = new File("/home/pc32/stuList/강연/roToRl.jpg");

        try(FileInputStream fis = new FileInputStream(readImg);
            FileOutputStream fos = new FileOutputStream(writeImg)){

            System.out.println(fis.available());
            byte[] bowl = new byte[fis.available()];

            fis.read(bowl);

            fos.write(bowl);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}

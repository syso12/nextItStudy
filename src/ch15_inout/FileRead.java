package ch15_inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("/home/pc32/stuList/total.txt");) {

            // 데이터를 옮길 그릇 생성
            char[] word = new char[100]; // fis처럼 넉넉하게 줘도 상관없다.

            StringBuffer strBuff = new StringBuffer();

            while (true){
                int cnt = reader.read(word);

                if (cnt == -1){
                    break;
                }

                System.out.println(word[0]);
                // char[] -> String
                String text = new String(word);
                strBuff.append(text);
            }
            System.out.println(strBuff);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

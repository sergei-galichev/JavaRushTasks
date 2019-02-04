package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream(args[0]);
        FileOutputStream fileWriter = new FileOutputStream(args[1]);
        while (fileReader.available() > 0){
            Charset win1251 = Charset.forName("Windows-1251");
            Charset utf8 = Charset.forName("UTF-8");
            byte[] buffer = new byte[fileReader.available()];
            int availableByte = fileReader.read(buffer);
            String s = new String(buffer, win1251);
            buffer = s.getBytes(utf8);
            fileWriter.write(buffer);
        }
        fileReader.close();
        fileWriter.close();
    }
}

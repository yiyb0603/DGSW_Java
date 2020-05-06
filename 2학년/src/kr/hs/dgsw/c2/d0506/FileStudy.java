package kr.hs.dgsw.c2.d0506;

import java.io.*;

public class FileStudy {
    public static void main(String[] args) {
        try {
            File directory = new File("C:\\Thread");

            if (!directory.exists()) {
                directory.mkdir();
            }

            File file = new File(directory, "hello.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            OutputStream os = new FileOutputStream(file);
            os.write("Hello World".getBytes());
            os.close();

            InputStream is = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int length = is.read(buffer);
            String text = new String(buffer,0, length);
            is.close();
            System.out.println("READ : " + text);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

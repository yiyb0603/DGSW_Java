package kr.hs.dgsw.main.d0609;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileSend {
    public static final String SERVER_IP = "127.0.0.1";
    public static final int PORT = 9000;
    public static final int BUFF_SIZE = 10000;
    public static final String SEND_FILE = "C:\\Thread\\b.txt";

    public static void main(String[] args) {
        try {
            File file = new File(SEND_FILE);
            if (file.exists()) {
                Socket socket = new Socket(SERVER_IP, PORT);

                // 파일에서 데이터를 읽음
                FileInputStream fin = new FileInputStream(file);
                OutputStream out = socket.getOutputStream();
                // 데이터를 서버로 전송

                int totalSize = 0;
                byte[] buff = new byte[BUFF_SIZE];
                int readSize = 0;
                while ((readSize = fin.read(buff)) != -1) {
                    out.write(buff, 0, readSize);
                    totalSize += readSize;
                    System.out.println("send size: " + totalSize);
                }

                // 종료 구문
                fin.close();
                out.close();
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        File file = new File(SEND_FILE);
    }
}

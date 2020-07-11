package kr.hs.dgsw.main.d0609;

import com.sun.security.ntlm.Server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileReceiver {
    public static final int PORT = 9000;
    public static final int BUFF_SIZE = 10000;
    public static final String DOWNLOAD = "C:\\Thread\\a.txt";

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(PORT);
            System.out.println("server start");
            Socket socket = server.accept();
            FileOutputStream fout = new FileOutputStream(DOWNLOAD);
            InputStream is = socket.getInputStream();

            byte[] buff = new byte[BUFF_SIZE];
            int readSize = 0;
            while ((readSize = is.read(buff)) != -1) {
                fout.write(buff, 0, readSize);
            }

            is.close();
            fout.close();
            socket.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

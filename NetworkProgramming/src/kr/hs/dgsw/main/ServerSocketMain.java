package kr.hs.dgsw.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {
    public static void main (String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Waiting Connect...");
            Socket socket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

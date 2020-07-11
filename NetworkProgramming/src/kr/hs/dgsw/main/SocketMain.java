package kr.hs.dgsw.main;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketMain {
    public static void main (String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("google.com");
            Socket socket = new Socket(inet, 80);
            System.out.println("connect: " + socket.isConnected());
            PrintStream out = new PrintStream(socket.getOutputStream());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

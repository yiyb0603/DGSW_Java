package kr.hs.dgsw.main.d0609;

import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPFileSend {
    public static final String SERVER_IP = "127.0.0.1";
    public static final int PORT = 9000;
    public static final int BUFF_SIZE = 10000;
    public static final String SEND_FILE = "C:\\Thread\\a.txt";

    public static void main(String[] args) {
        File file = new File(SEND_FILE);
        DatagramSocket ds = null;
        FileInputStream fin = null;

        try {
            // Socket socket = new Socket(SERVER_IP, PORT)
            ds = new DatagramSocket();
            fin = new FileInputStream(file);

            // 버퍼 생성
            byte[] buff = new byte[BUFF_SIZE];

            // 1. 파일 이름
            String temp = file.getName();
            DatagramPacket dp = new DatagramPacket(temp.getBytes(), // 파일명 (배열)
                    temp.getBytes().length, // 파일명 배열 길이
                    InetAddress.getByName(SERVER_IP), PORT);
            ds.send(dp);

            // 2. 파일 사이즈
            temp = String.valueOf(file.length());
            dp = new DatagramPacket(temp.getBytes(), // 파일명 (배열)
                    temp.getBytes().length, // 파일명 배열 길이
                    InetAddress.getByName(SERVER_IP), PORT);
            ds.send(dp);

            // 3. 파일 전송
            int readSize = 0;
            while ((readSize = fin.read(buff)) != -1) {
                dp = new DatagramPacket(buff, // 파일
                        readSize, // 읽은 사이즈
                        InetAddress.getByName(SERVER_IP), PORT);
                ds.send(dp);
            }

            fin.close();
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

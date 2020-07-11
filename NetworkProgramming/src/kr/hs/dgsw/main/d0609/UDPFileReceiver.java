package kr.hs.dgsw.main.d0609;

import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPFileReceiver {
    public static final int PORT = 8500;
    public static final int BUFF_SIZE = 10000;
    public static final String DOWNLOAD = "C:\\Thread\\b.txt";

    public static void main(String[] args) {
        System.out.println("udp server start");
        try {
            DatagramSocket ds = new DatagramSocket(PORT);

            byte[] buff = new byte[BUFF_SIZE];

            // 저장할 파일 선언
            FileOutputStream fout = new FileOutputStream(DOWNLOAD);
            DatagramPacket dp = new DatagramPacket(buff, BUFF_SIZE);
            ds.receive(dp);

            // 1. 파일명 전송
            String temp = new String(dp.getData()).trim(); // 공백 제거
            System.out.println("file name:" + temp);

            // 2. 파일 사이즈 전송
            dp = new DatagramPacket(buff, BUFF_SIZE);
            ds.receive(dp);
            temp = new String(dp.getData()).trim();
            long fileSize = Long.parseLong(temp);

            // 3. 파일 전송
            dp = new DatagramPacket(buff, BUFF_SIZE);
            long totalReadSize = 0;
            int readSize = 0;

            while (true) {
                ds.receive(dp);
                readSize = dp.getLength();
                totalReadSize += readSize;

                // 파일 쓰기
                fout.write(dp.getData(), 0, readSize);
                if (totalReadSize>= fileSize) { // 전송 종료
                    break;
                }
            }

            System.out.println("file save completed");
            fout.close(); // 파일 저장
            ds.close(); // OS에 포트 반환
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

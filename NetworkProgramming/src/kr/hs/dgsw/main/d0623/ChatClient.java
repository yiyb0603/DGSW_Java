package kr.hs.dgsw.main.d0623;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static final String ServerIP = "10.80.163.46";
    public static final int PORT = 5000;

    public static void main(String[] args) {
        try {
            //1 서버 접속
            Socket socket = new Socket(ServerIP, PORT);
            System.out.println("Connected");

            //2. 입력 스트림 선언
            InputStream is = socket.getInputStream();
            DataInputStream in =new DataInputStream(is);

            //3. 출력 스트림 선언
            OutputStream os = socket.getOutputStream();
            DataOutputStream out = new DataOutputStream(os);

            //4. 표준 키보드 입력 스트림 생성
            Scanner sc = new Scanner(System.in);

            //5. 출력 쓰레드 생성
            Thread writeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //1. ID등록
                    System.out.print("id input : ");
                    String msg = sc.nextLine();
                    try {
                        out.writeUTF(msg);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //2. 무한반복
                    while(true) {
                        try {
                            System.out.print("msg : ");
                            msg = sc.nextLine();
                            out.writeUTF(msg);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            //6. 입력 쓰레드 생성
            Thread readThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //1. 무한 반복
                    while(true) {
                        try {
                            String msg = in.readUTF();
                            System.out.println(msg);
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            //7 쓰레드 시작
            writeThread.start();
            readThread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
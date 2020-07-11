package kr.hs.dgsw.main;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkMain {
    public static void main (String[] args) {
        try {
            URL url = new URL("http://www.naver.com");
            System.out.println("host : " + url.getHost());
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Port: " + url.getPort());
            System.out.println("FileName: " + url.getFile());
            System.out.println("Path: " + url.getPath());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

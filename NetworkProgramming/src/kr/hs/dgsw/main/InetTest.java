package kr.hs.dgsw.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
    public static void main (String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("address : " + address);
            System.out.println("address : " + address.getHostAddress());
            System.out.println("host : " + address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

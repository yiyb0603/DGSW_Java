package kr.hs.dgsw.main.d0609;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpChecker {
    public static void checkIp(InetAddress inet) {
        System.out.println(inet);

        try {
            System.out.println("isReachable: " + inet.isReachable(1000));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("isAnyLocalAddress : " + inet.isAnyLocalAddress());
        System.out.println("isLoopbackAddress : " + inet.isLoopbackAddress());
        System.out.println("isLinkLocalAddress : " + inet.isLinkLocalAddress());
        System.out.println("isSiteLocalAddress : " + inet.isSiteLocalAddress());
        System.out.println("isMulticastAddress : " + inet.isMulticastAddress());
        System.out.println("isMCGlobal : " + inet.isMCGlobal());
        System.out.println("isMCNodeLocal : " + inet.isMCNodeLocal());
        System.out.println("isMCLinkLocal : " + inet.isMCLinkLocal());
        System.out.println("isMCOrgLocal : " + inet.isMCOrgLocal());
    }

    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("google.com");
            inet = InetAddress.getByName("127.0.0.1");
            checkIp(inet);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}

package kr.hs.dgsw.main.d0602;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class NIC_Exam {
    public void printNetworkInfo() {
        try {
            NetworkInterface nic = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()) ;
            System.out.println(nic);
            showNIC(nic);

            Enumeration<NetworkInterface> nics = NetworkInterface.getNetworkInterfaces();
            ArrayList<NetworkInterface> list = Collections.list(nics);

            for (int i = 0; i < list.size(); i++) {
                showNIC(list.get(i));
            }
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void showNIC(NetworkInterface nic) {
        System.out.println();
        System.out.println(nic.getDisplayName());
        System.out.println(nic.getName());
        Enumeration<InetAddress> inets = nic.getInetAddresses();
        ArrayList<InetAddress> list = Collections.list(inets);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }

        try {
            byte[] macs = nic.getHardwareAddress();
            String MAC = "";

            for (int i = 0; i < macs.length; i++) {
                MAC += String.format("%X", macs[i]);
            }
            System.out.println(MAC);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        NIC_Exam exam = new NIC_Exam();
        exam.printNetworkInfo();
    }
}

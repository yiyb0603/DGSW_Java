package kr.hs.dgsw.main.d0623;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.Scanner;

public class GroupChat {

    private static final String TERMINATE = "Exit";
    static String name;
    static volatile boolean finished = false;

    public static void main(String[] args) {
        if (false) {
            System.out.println("Two arguments required: <multicast-host> <port-number>");
        } else {
            try {
                InetAddress group = InetAddress.getByName("224.0.0.10");
                int port = Integer.parseInt("8600");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your name: ");
                name = sc.nextLine();
                MulticastSocket socket = new MulticastSocket(port);

                // Since we are deploying
                socket.setTimeToLive(0);
                // this on localhost only (For a subnet set it as 1)

                socket.joinGroup(group);
                Thread t = new Thread(new ReadThread(socket, group, port));

                // Spawn a thread for reading messages
                t.start();

                // sent to the current group
                System.out.println("Start typing messages...\n");
                while (true) {
                    String message;
                    message = sc.nextLine();
                    if (message.equalsIgnoreCase(GroupChat.TERMINATE)) {
                        finished = true;
                        socket.leaveGroup(group);
                        socket.close();
                        break;
                    }
                    message = name + ": " + message;
                    byte[] buffer = message.getBytes();
                    DatagramPacket datagram = new DatagramPacket(buffer, buffer.length, group, port);
                    socket.send(datagram);
                }
            } catch (SocketException se) {
                System.out.println("Error creating socket");
                se.printStackTrace();
            } catch (IOException ie) {
                System.out.println("Error reading/writing from/to socket");
                ie.printStackTrace();
            }
        }
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Enumeration;
import javax.swing.JOptionPane;

/**
 *
 * @author sunny
 */
public class test {
    
    public static void main(String arg[])
    {
        InetAddress ip;
        String ipAddress,macAddress;
        try{
            ip = InetAddress.getLocalHost();
            System.out.println("Current IP address : " + ip.getHostAddress());
            ipAddress=ip.getHostAddress();
            Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
            while(networks.hasMoreElements()){
                //NetworkInterface network = NetworkInterface.getByInetAddress(ip);
                NetworkInterface network=networks.nextElement();

                byte[] mac= network.getHardwareAddress();

                System.out.print("Current MAC address : ");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < mac.length; i++) {
                        sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                }
                System.out.println(sb.toString());
                macAddress=String.valueOf(sb.toString());
                JOptionPane.showMessageDialog(null, "MAC is "+macAddress+". IP is "+ipAddress);
            }            
        }
        catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
	}
    }
}

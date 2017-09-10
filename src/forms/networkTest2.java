/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Enumeration;
/**
 *
 * @author sunny
 */
public class networkTest2 {
    public static void main(String args[]) throws UnknownHostException{
        try {
                Process proc = Runtime.getRuntime().exec("arp -a ");

                BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

                // read the output from the command
                String s = null;

                while ((s = stdInput.readLine())!= null) {
                    String str=s;
                    String [] arrOfstr=str.split(" ");
                    String p1,p2,p3,p4,p5,p6,p7;
                    p1=arrOfstr[0];
                    p2=arrOfstr[1];
                    p3=arrOfstr[2];
                    p4=arrOfstr[3];
                    p5=arrOfstr[4];
                    p6=arrOfstr[5];
                    //p7=arrOfstr[6];
                    //for(String a : arrOfstr){
                        //System.out.println(p4);
                    //}
                    System.out.println(s);

                    // read any errors from the attempted command
                    while ((s = stdError.readLine()) != null) {
                        System.err.println(s);
                    }
                }
        }
        catch (IOException ex){
            System.err.println(ex);
        }
    }
}

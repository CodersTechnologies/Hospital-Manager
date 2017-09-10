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
public class networkTest {
    public static void main(String args[]) throws UnknownHostException{
        try {
                Process proc = Runtime.getRuntime().exec("arp -a ");

                BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

                // read the output from the command
                String s = null;

                while ((s = stdInput.readLine())!= null) {
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

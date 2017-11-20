
package com.mycompany.server;

import java.io.IOException;
import java.net.Socket;

public class Client {
    
    public static void main(String[] args) {//ako nema server running, ke isfrli isklucok
        //connection request to the server: 1.kade e IP adresata od sistemot kade serverot runing
        //kade e port number od taa server programa
        try{
        Socket s = new Socket("127.0.0.1", 3000);  //IP=local hostIP(od taa mashina) + portNumber kako 2 argumenti
            System.out.println("Connected.");
        }catch(IOException e){
        }
    }
}

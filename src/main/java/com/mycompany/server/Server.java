
package com.mycompany.server;

import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
      
     
        try{//vo slucaj 3000 da e zafateno
        ServerSocket server = new ServerSocket(3000);
        Socket s  = server.accept();//da go startirame serverot
            System.out.println("Connected.");
        }catch (IOException e){
            //System.err.println("Could not listen on port: " + portNumber);
            //System.exit(1);
        }
    }
}

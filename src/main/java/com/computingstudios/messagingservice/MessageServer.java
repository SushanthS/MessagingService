/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computingstudios.messagingservice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author svallath
 */
@Component
public class MessageServer implements Runnable {

    @Autowired
    private UserList userList;

    @Autowired
     private ObjectFactory<UserConnection> myServiceFactory;
    
    @Override
    public void run() {
        int portNumber = 4444;
        System.out.println("Starting Server at ..." + portNumber);
        boolean listening=true;
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {            
            while (listening) {
                Socket socket = serverSocket.accept();
                UserConnection userConnection = this.myServiceFactory.getObject();
                userConnection.port = socket.getPort();
                System.out.println(userConnection.toString());
//                userList.add(Integer.toString(socket.getPort()), socket.getLocalAddress().getHostAddress());
                new MessageServerThread(socket).start();
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }

}

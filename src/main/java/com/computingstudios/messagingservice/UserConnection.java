/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computingstudios.messagingservice;

import java.net.InetAddress;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author svallath
 */
@Component
@Scope("prototype")
public class UserConnection {
    InetAddress ip;
    int port;
    
}

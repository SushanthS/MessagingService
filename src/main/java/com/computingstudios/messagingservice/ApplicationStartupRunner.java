/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computingstudios.messagingservice;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author svallath
 */
@Component
public class ApplicationStartupRunner 
        implements CommandLineRunner 
{

    final Logger logger = Logger.getLogger(getClass());

    @Autowired
    MessageServer messageServer;

    @Override
    public void run(String... beanNames) throws Exception {
        logger.info("Starting Messaging Server...");

        messageServer.run();
    }
}

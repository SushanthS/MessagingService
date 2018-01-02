/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computingstudios.messagingservice;

/**
 *
 * @author svallath
 */
public class User {

    private final long id;
    private final String name;

    public User(long id, String content) {
        this.id = id;
        this.name = content;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

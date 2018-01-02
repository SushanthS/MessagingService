/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.computingstudios.messagingservice;

import java.util.HashMap;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 * @author svallath
 */
@Component
@ComponentScan
public class UserList {

    private HashMap userList;

    public HashMap getUserList() {
        return userList;
    }

    public void setUserList(HashMap userList) {
        this.userList = userList;
    }

    public UserList() {
        this.userList = new HashMap<UserConnection, User>();
    }

    void add(UserConnection connection, User user) {
        this.userList.put(connection, user);
    }

    void delete(UserConnection connection) {
        this.userList.remove(connection);
    }
}

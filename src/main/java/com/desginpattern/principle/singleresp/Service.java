package com.desginpattern.principle.singleresp;

public abstract class Service {
    public abstract void doLogin();

    public abstract void getDBConnection();

    public abstract void updateUserState();
}

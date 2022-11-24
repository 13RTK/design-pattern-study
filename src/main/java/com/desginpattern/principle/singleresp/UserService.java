package com.desginpattern.principle.singleresp;

import java.util.Date;
import java.util.List;

public abstract class UserService {
    public abstract int updateUserId(int id);

    public abstract int deleteUserById(int id);

    public abstract List<Object> getUsersByDate(Date date);
}

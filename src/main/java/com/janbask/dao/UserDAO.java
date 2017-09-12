package com.janbask.dao;

import com.janbask.model.User;

public interface UserDAO {

	User getUserByCredentials(String userId, String password);
}
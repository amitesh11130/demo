package com.ak.service;

import com.ak.exception.UserNotFound;
import com.ak.entity.User;

interface UserManagement {

        void registerUser(User user);
        void removeUser(String id) throws UserNotFound;
        void updateUserInfo(String id, String newName) throws UserNotFound;
        User searchUser(String id) throws UserNotFound;
}

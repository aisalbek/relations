package org.example.dao;

import org.example.entites.Phone;
import org.example.entites.User;

public interface Userdaoimpl {

    void saveUser(User user);
    void savePhone(Long userid, Phone phone);
}

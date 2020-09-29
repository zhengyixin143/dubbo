package com.lj.common.service;
import com.lj.common.domin.User;

import java.util.List;

public interface UserService {
    User findUser();
    List<User> getAll();
}

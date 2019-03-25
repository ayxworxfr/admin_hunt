package com.worxfr.service;

import com.worxfr.common.ServerResponse;
import com.worxfr.pojo.User;

public interface IUserService {
    ServerResponse login(User user);
    ServerResponse regist(User user);
}

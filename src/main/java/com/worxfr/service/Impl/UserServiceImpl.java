package com.worxfr.service.Impl;

import com.worxfr.common.ServerResponse;
import com.worxfr.pojo.User;
import com.worxfr.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public ServerResponse login(User user) {
        return ServerResponse.createBySuccess("success");
    }

    @Override
    public ServerResponse regist(User user) {
        return null;
    }
}

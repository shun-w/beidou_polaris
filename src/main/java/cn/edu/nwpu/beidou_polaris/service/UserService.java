package cn.edu.nwpu.beidou_polaris.service;

import cn.edu.nwpu.beidou_polaris.exception.UserException;
import cn.edu.nwpu.beidou_polaris.pojo.User;

public interface UserService {
    User login(String username, String password);

    void sendMessage(Integer userId, String username, String message);

    void register(User user) throws UserException;
}

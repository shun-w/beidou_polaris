package cn.edu.nwpu.beidou_polaris.service.impl;

import cn.edu.nwpu.beidou_polaris.mapper.ChatMessageMapper;
import cn.edu.nwpu.beidou_polaris.mapper.UserMapper;
import cn.edu.nwpu.beidou_polaris.pojo.ChatMessage;
import cn.edu.nwpu.beidou_polaris.pojo.User;
import cn.edu.nwpu.beidou_polaris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
@Autowired
private ChatMessageMapper chatMessageMapper;
    @Override
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }

    @Override
    public void sendMessage(Integer userId, String username, String message) {
        User receiver = userMapper.findUserByUsername(username);
        ChatMessage chatMessage = new ChatMessage(null, userId, receiver.getId(),message,new Date());
        chatMessageMapper.saveMessage(chatMessage);
    }
}

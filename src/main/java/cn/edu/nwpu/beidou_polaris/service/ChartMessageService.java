package cn.edu.nwpu.beidou_polaris.service;

import cn.edu.nwpu.beidou_polaris.pojo.ChatMessage;

import java.util.List;

public interface ChartMessageService {
    List<ChatMessage> getMessageByReceiverId(Integer userId);
}

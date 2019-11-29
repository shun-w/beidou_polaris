package cn.edu.nwpu.beidou_polaris.service.impl;

import cn.edu.nwpu.beidou_polaris.mapper.ChatMessageMapper;
import cn.edu.nwpu.beidou_polaris.pojo.ChatMessage;
import cn.edu.nwpu.beidou_polaris.service.ChartMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ChartMessageServiceImpl implements ChartMessageService {
    @Autowired
    private ChatMessageMapper chatMessageMapper;
    @Override
    public List<ChatMessage> getMessageByReceiverId(Integer userId) {
        return chatMessageMapper.selectMessageByReceiverId(userId);
    }
}

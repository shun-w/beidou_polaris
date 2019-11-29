package cn.edu.nwpu.beidou_polaris.service.impl;

import cn.edu.nwpu.beidou_polaris.mapper.NotificationMapper;
import cn.edu.nwpu.beidou_polaris.pojo.Notification;
import cn.edu.nwpu.beidou_polaris.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationMapper notificationMapper;
    @Override
    public Notification getRecentNotification() {
        return notificationMapper.getRecentNotification();
    }
}

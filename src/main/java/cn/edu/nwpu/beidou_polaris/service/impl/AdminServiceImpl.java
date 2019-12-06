package cn.edu.nwpu.beidou_polaris.service.impl;

import cn.edu.nwpu.beidou_polaris.mapper.NotificationMapper;
import cn.edu.nwpu.beidou_polaris.pojo.Notification;
import cn.edu.nwpu.beidou_polaris.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private NotificationMapper notificationMapper;
    @Override
    public void uploadNotification(Notification notification) {
        notificationMapper.save(notification);
    }
}

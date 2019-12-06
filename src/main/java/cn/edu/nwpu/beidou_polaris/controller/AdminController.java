package cn.edu.nwpu.beidou_polaris.controller;

import cn.edu.nwpu.beidou_polaris.pojo.Notification;
import cn.edu.nwpu.beidou_polaris.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/admin/notification_upload")
    public ResponseEntity<Void> uploadNotification(String content){
        Notification notification = new Notification(null, 1,content,new Date());
        adminService.uploadNotification(notification);
        return ResponseEntity.ok().build();
    }
}

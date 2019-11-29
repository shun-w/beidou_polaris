package cn.edu.nwpu.beidou_polaris.controller;

import cn.edu.nwpu.beidou_polaris.pojo.Notification;
import cn.edu.nwpu.beidou_polaris.service.NotificationService;
//import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/")
    public ResponseEntity<String> testAlive() {
        return ResponseEntity.ok("团队服务器正常运行着!!");
    }

    @GetMapping("/notification")
    public ResponseEntity<Notification> notification() {
        Notification recentNotification = notificationService.getRecentNotification();
        return ResponseEntity.ok(recentNotification);
    }

}

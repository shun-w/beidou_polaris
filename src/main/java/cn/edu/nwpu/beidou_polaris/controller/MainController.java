package cn.edu.nwpu.beidou_polaris.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public ResponseEntity<String> testAlive() {
        return ResponseEntity.ok("团队服务器正常运行着!!");
    }

    @GetMapping("/notification")
    public ResponseEntity<String> notification() {

    }
}

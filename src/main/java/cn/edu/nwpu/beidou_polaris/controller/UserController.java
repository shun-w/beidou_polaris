package cn.edu.nwpu.beidou_polaris.controller;


import cn.edu.nwpu.beidou_polaris.pojo.ChatMessage;
import cn.edu.nwpu.beidou_polaris.pojo.Position;
import cn.edu.nwpu.beidou_polaris.pojo.User;
import cn.edu.nwpu.beidou_polaris.service.ChartMessageService;
import cn.edu.nwpu.beidou_polaris.service.PositionService;
import cn.edu.nwpu.beidou_polaris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@RestController()
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private ChartMessageService chartMessageService;

    @PostMapping("/user/login")
    public ResponseEntity<Integer> login(String username, String password
            , HttpServletResponse response
    ) {
        User user = userService.login(username, password);
        if (user == null || user.getUsername() == null) {
            return ResponseEntity.badRequest().build();
        } else {
            response.addCookie(new Cookie("username", user.getUsername()));
            response.addCookie(new Cookie("userId", user.getId().toString()));
            return ResponseEntity.ok().body(user.getId());
        }
    }

    @GetMapping("/user/position/{userId}")
    public ResponseEntity<List<Position>> getRecentPosition(@PathVariable("userId") Integer userId) {
        try {
            return ResponseEntity.ok().body(positionService.getRecentPositionByUserId(userId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/user/allPosition/{userId}")
    public ResponseEntity<List<Position>> getAllPosition(@PathVariable("userId") Integer userId) {
        try {
            return ResponseEntity.ok().body(positionService.getAllPositionByUserId(userId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/user/chat/{userId}")
    public ResponseEntity<List<ChatMessage>> getMSG(@PathVariable("userId") Integer userId) {
        try {
            List<ChatMessage> chatMessages = chartMessageService.getMessageByReceiverId(userId);
            return ResponseEntity.ok().body(chatMessages);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/user/position/{userId}")
    public ResponseEntity<Void> addPosition(@PathVariable("userId") Integer userId, Float longitude, Float latitude,
                                            Float altitude) {
        try {
            Position position = new Position(null, userId, longitude, latitude, altitude, new Date());
            positionService.addPosition(position);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/user/chat/{userId}")
    public ResponseEntity<Void> sendMSG(@PathVariable("userId") Integer userId, String username, String message, HttpServletRequest request) {

        try {
            userService.sendMessage(userId, username, message);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}

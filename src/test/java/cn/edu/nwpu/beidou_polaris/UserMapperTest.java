package cn.edu.nwpu.beidou_polaris;

import cn.edu.nwpu.beidou_polaris.mapper.UserMapper;
import cn.edu.nwpu.beidou_polaris.pojo.Position;
import cn.edu.nwpu.beidou_polaris.pojo.User;
import cn.edu.nwpu.beidou_polaris.service.PositionService;
import javafx.geometry.Pos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testLogin() {
        User lisi = userMapper.login("lisi", "123456");
        System.out.println(lisi.toString());
    }

    @Autowired
    private PositionService positionService;

    @Test
    public void testLogin1() {
        Position position = new Position(null, 1, 8.8f, 8.8f, 6.6f,new Date());
        positionService.addPosition(position);
    }
}

package cn.edu.nwpu.beidou_polaris.service.impl;

import cn.edu.nwpu.beidou_polaris.mapper.PositionMapper;
import cn.edu.nwpu.beidou_polaris.pojo.Position;
import cn.edu.nwpu.beidou_polaris.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PositionServiceImpl implements PositionService {
    private static Integer num = 5;
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> getRecentPositionByUserId(Integer userId) {
        List<Position> positions = positionMapper.selectAllPositionByUserId(userId);

        if (positions.size() <= num) {
            return positions;
        } else {
            List<Position> positionList = new ArrayList<Position>();
            for (int i = 0; i < num; i++) {
                positionList.add(positions.get(i));
            }
            return positionList;
        }

    }

    @Override
    public List<Position> getAllPositionByUserId(Integer userId) {
        return positionMapper.selectAllPositionByUserId(userId);
    }

    @Override
    public void addPosition(Position position) {
        System.out.println("position: "+position.toString());
        positionMapper.save(position);
        System.out.println("position: "+position.toString());
    }
}

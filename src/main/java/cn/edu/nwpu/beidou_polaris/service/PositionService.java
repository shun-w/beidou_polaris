package cn.edu.nwpu.beidou_polaris.service;

import cn.edu.nwpu.beidou_polaris.pojo.Position;

import java.util.List;

public interface PositionService {
    List<Position> getRecentPositionByUserId(Integer userId);
    public List<Position> getAllPositionByUserId(Integer userId);

    void addPosition(Position position);
}

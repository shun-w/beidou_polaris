package cn.edu.nwpu.beidou_polaris.mapper;

import cn.edu.nwpu.beidou_polaris.pojo.Position;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PositionMapper {
    @Select("select * from position where user_id=#{userId} order by insert_time desc")
    public List<Position> selectAllPositionByUserId(@Param("userId") Integer uerId);

    @Insert("insert into position values (null, #{userId}, #{longitude},#{latitude},#{altitude},#{insertTime})")
    @Options(keyColumn = "id",keyProperty = "id",useGeneratedKeys = true)
    int save(Position position);
}

package cn.edu.nwpu.beidou_polaris.mapper;

import cn.edu.nwpu.beidou_polaris.pojo.Notification;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface NotificationMapper {
    @Select("select * from notification where id = (select max(id) from notification)")
    Notification getRecentNotification();

    @Insert("insert into notification values(null, #{adminId}, #{content}, #{publishTime})")
    @Options(keyProperty = "id", keyColumn = "id", useGeneratedKeys = true)
    void save(Notification notification);
}

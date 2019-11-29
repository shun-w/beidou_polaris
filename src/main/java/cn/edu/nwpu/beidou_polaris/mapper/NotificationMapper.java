package cn.edu.nwpu.beidou_polaris.mapper;

import cn.edu.nwpu.beidou_polaris.pojo.Notification;
import org.apache.ibatis.annotations.Select;

public interface NotificationMapper {
    @Select("select * from notification where id = (select max(id) from notification)")
    Notification getRecentNotification();
}

package cn.edu.nwpu.beidou_polaris.mapper;

import cn.edu.nwpu.beidou_polaris.pojo.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChatMessageMapper {
    @Select("select * from chat_message where receiver_id=#{userId} order by send_time desc")
    List<ChatMessage> selectMessageByReceiverId(@Param("userId") Integer userId);

    @Insert("insert into chat_message values(#{id},#{senderId}, #{receiverId},#{message}, #{sendTime})")
    @Options(keyProperty = "id", keyColumn = "id", useGeneratedKeys = true)
    int saveMessage(ChatMessage chatMessage);
}

package cn.edu.nwpu.beidou_polaris.pojo;

import java.util.Date;

public class Notification {
    private Integer id;
    private Integer adminId;
    private String content;
    private Date publishTime;
    public Notification(Integer id, Integer adminId, String content, Date publishTime) {
        this.id = id;
        this.adminId = adminId;
        this.content = content;
        this.publishTime = publishTime;
    }
    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", content='" + content + '\'' +
                ", publishTime=" + publishTime +
                '}';
    }



    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

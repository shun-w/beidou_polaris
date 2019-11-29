package cn.edu.nwpu.beidou_polaris.pojo;

import java.util.Date;

public class Position {

    private Integer id;
    private Integer userId;
    private Float longitude;
    private Float latitude;
    private Float altitude;
    private Date insertTime;



    public Position(Integer id, Integer userId, Float longitude, Float latitude, Float altitude, Date insertTime) {
        this.id = id;
        this.userId = userId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.insertTime = insertTime;
    }
    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", userId=" + userId +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", altitude=" + altitude +
                ", insertTime=" + insertTime +
                '}';
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}

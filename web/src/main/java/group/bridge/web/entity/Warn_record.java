package group.bridge.web.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "warn_record")
public class Warn_record {

    @Id
    @Column(name="warn_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "warn_date")
    private Date warn_date;
    @Column(name = "status")
    private String status;
//    insertable和updatable(不需要修改，不需要插入该字段的值)属性一般多用于只读的属性，例如主键和外键等。
//    这些字段的值通常是自动生成的。
    @Column(name = "bridge_id",insertable = false,updatable = false)
    private Integer bridge_id;
    @Column(name = "sensor_id",insertable = false,updatable = false)
    private Integer sensor_id;
//    @ManyToOne
//    private Bridge bridge;
//    @ManyToOne
//    private Sensor sensor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getWarn_date() {
        return warn_date;
    }

    public void setWarn_date(Date warn_date) {
        this.warn_date = warn_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBridge_id() {
        return bridge_id;
    }

    public void setBridge_id(Integer bridge_id) {
        this.bridge_id = bridge_id;
    }

    public Integer getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(Integer sensor_id) {
        this.sensor_id = sensor_id;
    }
}
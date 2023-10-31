package com.support.model;


import javax.persistence.*;

@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer time;
    private String transportation;
    private Integer isDelete;
    @ManyToOne
    @JoinColumn(name = "tourId", referencedColumnName = "id")
    private Tour tour;
    @ManyToOne
    @JoinColumn(name = "scheduleDetailId", referencedColumnName = "id")
    private ScheduleDetail scheduleDetail;

    public Schedule() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public ScheduleDetail getScheduleDetail() {
        return scheduleDetail;
    }

    public void setScheduleDetail(ScheduleDetail scheduleDetail) {
        this.scheduleDetail = scheduleDetail;
    }
}

package com.java.tickat.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tbl_todolist", schema = "test", catalog = "")
public class TblTodolistEntity {
    private String id;
    private boolean available;
    private String userId;
    private String title;
    private String content;
    private Integer pomodoro;
    private Timestamp createTime;
    private Date deadline;
    private Boolean isRepeat;
    private Date startDate;
    private Date endDate;
    private Boolean monday;
    private Boolean tuesday;
    private Boolean wednesday;
    private Boolean thursday;
    private Boolean friday;
    private Boolean saturday;
    private Boolean sunday;

    @Id
    @Column(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Available")
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Basic
    @Column(name = "UserId")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "Pomodoro")
    public Integer getPomodoro() {
        return pomodoro;
    }

    public void setPomodoro(Integer pomodoro) {
        this.pomodoro = pomodoro;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "Deadline")
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "IsRepeat")
    public Boolean getRepeat() {
        return isRepeat;
    }

    public void setRepeat(Boolean repeat) {
        isRepeat = repeat;
    }

    @Basic
    @Column(name = "StartDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Monday")
    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    @Basic
    @Column(name = "Tuesday")
    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    @Basic
    @Column(name = "Wednesday")
    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    @Basic
    @Column(name = "Thursday")
    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    @Basic
    @Column(name = "Friday")
    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    @Basic
    @Column(name = "Saturday")
    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    @Basic
    @Column(name = "Sunday")
    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblTodolistEntity that = (TblTodolistEntity) o;
        return available == that.available &&
                Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(pomodoro, that.pomodoro) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(deadline, that.deadline) &&
                Objects.equals(isRepeat, that.isRepeat) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(monday, that.monday) &&
                Objects.equals(tuesday, that.tuesday) &&
                Objects.equals(wednesday, that.wednesday) &&
                Objects.equals(thursday, that.thursday) &&
                Objects.equals(friday, that.friday) &&
                Objects.equals(saturday, that.saturday) &&
                Objects.equals(sunday, that.sunday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, available, userId, title, content, pomodoro, createTime, deadline, isRepeat, startDate, endDate, monday, tuesday, wednesday, thursday, friday, saturday, sunday);
    }
}

package com.java.tickat.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tbl_user", schema = "test", catalog = "")
public class TblUserEntity {
    private String id;
    private String nickname;
    private String password;
    private String username;
    private String pomodoro;
    private String gender;
    private String mobile;
    private String qq;
    private String emailAddress;
    private String otherContact;
    private Timestamp birthday;
    private Timestamp createTime;
    private Boolean available;

    @Id
    @Column(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Pomodoro")
    public String getPomodoro() {
        return pomodoro;
    }

    public void setPomodoro(String pomodoro) {
        this.pomodoro = pomodoro;
    }

    @Basic
    @Column(name = "Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "Mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "QQ")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "OtherContact")
    public String getOtherContact() {
        return otherContact;
    }

    public void setOtherContact(String otherContact) {
        this.otherContact = otherContact;
    }

    @Basic
    @Column(name = "Birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
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
    @Column(name = "Available")
    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblUserEntity that = (TblUserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(password, that.password) &&
                Objects.equals(username, that.username) &&
                Objects.equals(pomodoro, that.pomodoro) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(emailAddress, that.emailAddress) &&
                Objects.equals(otherContact, that.otherContact) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(available, that.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, password, username, pomodoro, gender, mobile, qq, emailAddress, otherContact, birthday, createTime, available);
    }
}

package com.lyw.source.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 类描述：
 *
 * @author liangyuwu
 * @Time 2018/5/18 16:34
 */
public class User implements Serializable{
    private static final long serialVersionUID = -5259750829158076472L;

    private Integer userId;
    private String email;
    private String userName;
    private String emailTopic;
    private Date emailDays;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailTopic() {
        return emailTopic;
    }

    public void setEmailTopic(String emailTopic) {
        this.emailTopic = emailTopic;
    }

    public Date getEmailDays() {
        return emailDays;
    }

    public void setEmailDays(Date emailDays) {
        this.emailDays = emailDays;
    }
}

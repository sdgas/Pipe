package org.sdgas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wilson.he on 2016/1/18.
 */
@Entity
@Table(name = "person")
public class User {

    /**
     * 工号
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 登陆密码
     */
    private String pwd;

    @Id
    @Column(length = 6)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(length = 10, nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(length = 16, nullable = false)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

package cn.lnu.entity;

import cn.lnu.util.FormatDate;
import org.springframework.format.annotation.DateTimeFormat;
import sun.util.resources.ga.LocaleNames_ga;

import java.io.Serializable;
import java.util.*;

/**
 * 用户实体pojo
 * @Author：ccl
 * @Date：19-3-24 上午10:53
 */
public class TbUser implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;

    public TbUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", created=" + FormatDate.format(created.toString()) +
                ", updated=" + FormatDate.format(updated.toString()) +
                '}';
    }
}

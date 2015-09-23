package com.souche.Controller;

import com.souche.Annotation.Phone;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by liuqizhe on 15/9/22.
 */
public class User {
    @NotEmpty(message="用户名不能为空")
    private String username ;
    @Size(min=6,max=10,message="密码位数必须在{min}-{max}之间")
    private String password ;
    @Phone(message="电话号码格式必须是13，15，18开头的")
    private String telephone ;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

package com.souche.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import javax.validation.Valid;

/**
 * toAdd.from->UserController.toAddUser
 * add.from->UserController.addUser
 *
 * Created by liuqizhe on 15/9/22.
 */
@Controller
public class UserController {
    //进入addUser.jsp
    @RequestMapping("/toAdd")
    public String addUser(Model model) {
        model.addAttribute("user", new User()) ;
        return "addUser" ;
    }

    //处理注册按钮提交
    @RequestMapping("/add")
    public String addUser(@Valid User user, BindingResult errors, Model model) {
        //将user写入模型
        model.addAttribute("user", user) ;
        //检测errors如果有错误，返回addUser.jsp注册页面
        if(errors.hasErrors()) {
            return "addUser" ;
        }

        //TODO 接收表单信息，写入DB表
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println("利用JDBC技术将user写入数据库表");

        return "ok" ;
    }

}

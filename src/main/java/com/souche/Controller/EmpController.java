package com.souche.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuqizhe on 15/9/22.
 */
@Controller
public class EmpController {
    @RequestMapping("/toUpdateEmp")
    public String toUpdate(Model model) {
        //去数据库加载原来输入的Emp信息
        Emp emp = new Emp() ;
        emp.setName("汪峰") ;
        emp.setAge(45) ;
        emp.setSex("M") ;
        emp.setDescr("鸟巢演唱会向子怡求婚") ;
        emp.setCity("bj") ;
        emp.setFavor("3") ;
        emp.setFavs(new String[]{"b", "c"});
        emp.setFavs(new String[]{"b", "c"});
        emp.setCities(new String[]{"bj", "tj", "sh", "gz"});
        model.addAttribute("emp", emp) ;
        return "updateEmp" ;
    }

    //加载喜爱城市选项，自动放入Model中
    @ModelAttribute("cityMap")
    public Map<String, Object> getCities() {
        //放喜爱城市选项,从数据库取出
        Map<String,Object> cityMap = new HashMap<String, Object>() ;
        cityMap.put("bj", "北京") ;
        cityMap.put("tj", "天津") ;
        cityMap.put("sh", "上海") ;
        cityMap.put("gz", "广州") ;
        return cityMap ;
    }
}

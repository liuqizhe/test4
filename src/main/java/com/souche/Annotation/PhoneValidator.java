package com.souche.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 注解@phone的校验器，实现以下验证逻辑
 * 非空，而且必须是以13，15，18开始的手机号
 *
 * Created by liuqizhe on 15/9/22.
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {

    private String phoneReg = "^1[3|5|8]\\d{9}$" ;

    public void initialize(Phone phone) {

    }

    public boolean isValid(String value, ConstraintValidatorContext arg1) {
        //检查是否为空
        if(value == null || "".equals(value)){
            return false ;
        }

        //根据phoneReg正则表达式字符串生成一个Pattern
        Pattern phonePattern = Pattern.compile(phoneReg) ;
        Matcher matcher = phonePattern.matcher(value) ;
        return matcher.matches() ;
    }
}

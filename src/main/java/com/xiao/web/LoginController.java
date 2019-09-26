package com.xiao.web;

import com.alibaba.fastjson.JSON;
import com.xiao.entity.Msg;
import com.xiao.entity.UserRequest;
import com.xiao.service.impl.EmpServiceImpl;
import com.xiao.util.CookieUtil;
import com.xiao.util.JWTUtil;
import com.xiao.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LoginController <br/>
 * Description: <br/>
 * date: 2019/9/26 10:38<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@Controller
public class LoginController {
    @Autowired
    private EmpServiceImpl empServiceimp;

   @RequestMapping("/login")
    public String login(String username, String pwd){
       System.out.println("z执行了");
        int i = empServiceimp.login(username, pwd);
        Map<String, Object> map = new HashMap<String, Object>();
        if(i>0){
            Msg m =new Msg();
            m.setCode(Msg.code1);
            m.setMsg(Msg.msg1);
            map.put("data",m);
            UserRequest  userRequest =new UserRequest();
            userRequest.setUsername(MD5Util.toMd5(username));
            userRequest.setUsername(MD5Util.toMd5(pwd));
            JWTUtil.sign(userRequest,10);
            return "samllTable";
        }else{
            Msg m =new Msg();
            m.setCode(Msg.code2);
            m.setMsg(Msg.msg2);
            map.put("data",m);
            return "dept";
        }

    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String test(HttpServletResponse response){
        // 放置cookies
        Map<String,String> map = new HashMap<String, String>();
        map.put("md5","test");
        map.put("pwd","hisen");
        CookieUtil.addCookieMap(response,map);
        return "hello";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String testJWT(HttpServletResponse res,HttpServletRequest req){
        Boolean checkJWT = JWTUtil.checkJWT(req);
        if (checkJWT) {
            return "成功";
        }
        return "失败";
    }


}

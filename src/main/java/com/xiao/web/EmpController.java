package com.xiao.web;

import com.xiao.entity.Emp;
import com.xiao.entity.ParameterPOJO;
import com.xiao.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: EmpController <br/>
 * Description: <br/>
 * date: 2019/9/17 10:54<br/>
 *
 * @author me<br />o
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpServiceImpl empServiceimp;
    @RequestMapping("/welcomPage")
    public String welcomPage(){

        System.out.println("yyyyyyy");
        return "ok";
    }
    @RequestMapping("/listEmp")
    @ResponseBody
    public Map<String, Object> listEmp( ){
        int count =empServiceimp.countDept();

        ParameterPOJO p = new ParameterPOJO();
        p.setPram1(1);
        p.setPram2(10);
        List<Emp> emps = empServiceimp.listEmp(p);
        Map map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", emps);
        return map;
    }

}

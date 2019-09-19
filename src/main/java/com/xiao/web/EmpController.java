package com.xiao.web;

import com.xiao.entity.Emp;
import com.xiao.entity.ParameterPOJO;
import com.xiao.service.impl.EmpServiceImpl;
import com.xiao.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
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
        return "dept";
    }
    @RequestMapping("/listEmp")
    @ResponseBody
    public Map<String, Object> listEmp( int page,int limit){
        int count =empServiceimp.countDept();

        ParameterPOJO p = new ParameterPOJO();
        p.setPram1(page);
        p.setPram2(limit);
        List<Emp> emps = empServiceimp.listEmp(p);
        Map map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", emps);
        return map;
    }
    @RequestMapping("/downloadEmp")
     public void downloadEmp(HttpServletRequest request, HttpServletResponse response,int page, int limit){
        int count =empServiceimp.countDept();

        ParameterPOJO p = new ParameterPOJO();
        p.setPram1(page);
        p.setPram2(limit);
        List<Emp> emps = empServiceimp.listEmp(p);
        List<Object[]> list = new ArrayList<>();
        for (Emp emp : emps) {
            Object[] o = new Object[4];
            o[0] = emp.getDept_no();
            o[1] = emp.getEmp_no();
            o[2] = emp.getFrom_date();
            o[3] = emp.getTo_date();
            list.add(o);
        }
        String[] rowsName = new String[] { "部门id", "员工id", "就职日期", "离职日期", };
        ExcelUtil excelUtil = new ExcelUtil();
        try{
            excelUtil.exportExcel(request,"test",rowsName,list,"测试excel文档.xlsx",response);


        }catch(Exception e){
            e.printStackTrace();
        }

    }

}

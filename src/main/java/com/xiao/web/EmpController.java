package com.xiao.web;

import com.alibaba.excel.EasyExcel;
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
import java.io.IOException;
import java.net.URLEncoder;
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
//    @RequestMapping("/downloadEmp")
//     public void downloadEmp(HttpServletRequest request, HttpServletResponse response,int page, int limit){
//        int count =empServiceimp.countDept();
//
//        ParameterPOJO p = new ParameterPOJO();
//        p.setPram1(page);
//        p.setPram2(limit);
//        List<Emp> emps = empServiceimp.listEmp(p);
//        List<Object[]> list = new ArrayList();
//        for (Emp emp : emps) {
//            Object[] o = new Object[4];
//            o[0] = emp.getDept_no();
//            o[1] = emp.getEmp_no();
//            o[2] = emp.getFrom_date();
//            o[3] = emp.getTo_date();
//            list.add(o);
//        }
//        String[] rowsName = new String[] { "部门id", "员工id", "就职日期", "离职日期", };
//        ExcelUtil excelUtil = new ExcelUtil();
//        try{
//            excelUtil.exportExcel(request,"test",rowsName,list,"测试excel文档.xlsx",response);
//
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//    }
    @RequestMapping("/downloadEmp2")
     public void downloadEmp2(HttpServletRequest request, HttpServletResponse response,int page, int limit) throws IOException {
        int count =empServiceimp.countDept();

        ParameterPOJO p = new ParameterPOJO();
        p.setPram1(page);
        p.setPram2(limit);

        List<Emp> emps = empServiceimp.listEmp(p);
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        if (request.getHeader("user-agent").toLowerCase().indexOf("firefox") > -1) {
            //火狐浏览器自己会对URL进行一次URL转码所以区别处理
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String("demo.xlsx".getBytes("utf-8"), "ISO-8859-1"));
        } else {
            response.setHeader("Content-Disposition", "attachment;filename="
                    + URLEncoder.encode("demo.xlsx","utf-8"));        }

        System.out.println(emps.toString());

        EasyExcel.write(response.getOutputStream(), Emp.class).sheet("模板").doWrite(emps);

    }

}

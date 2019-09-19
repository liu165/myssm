package com.xiao.web;

import com.xiao.util.ExcelUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ExcelController <br/>
 * Description: <br/>
 * date: 2019/9/18 17:11<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@Controller
public class ExcelController {
    @RequestMapping("exportWordData")
    public void exportExcelData(HttpServletRequest request, HttpServletResponse response){

        // 定义表的标题
        String title = "员工列表一览";
        //定义表的列名
        String[] rowsName = new String[] { "序号", "姓名", "性别", "特长", "学历", "入职时间", "简历", "照片", "部门" };
        //定义表的内容
        List<Object[]> dataList = new ArrayList<Object[]>();
        Object[] objs = new Object[9];
        objs[0] = "测试";
        objs[1] = 11;
        objs[2] = "111";
        objs[3] = "测试";
        objs[4] = "测试";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(2018-12-24);
        objs[5] = date;
        objs[6] = "测试";
        objs[7] = "测试";
        objs[8] = "测试";
        dataList.add(objs);
        // 创建ExportExcel对象
        ExcelUtil excelUtil = new ExcelUtil();



            try{
            excelUtil.exportExcel(request,title,rowsName,dataList,"测试excel文档.xlsx",response);


            }catch(Exception e){
                e.printStackTrace();
            }
    }
}

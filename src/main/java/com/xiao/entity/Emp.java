package com.xiao.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * ClassName: Emp <br/>
 * Description: <br/>
 * date: 2019/9/17 10:47<br/>
 *  员工表的实体类
 * @author me<br />
 * @since JDK 1.8
 */
@Data
@ColumnWidth(20)
public class Emp {
    @ExcelProperty({"大海公司","员工号"})
    private int emp_no;
    @ExcelProperty({"大海公司","部门号"})
    private String dept_no;
    @ColumnWidth(30)
    @ExcelProperty({"大海公司","就职日期"})
    private String from_date;
    @ColumnWidth(30)
    @ExcelProperty({"大海公司","离职日期"})
    private String to_date;

}

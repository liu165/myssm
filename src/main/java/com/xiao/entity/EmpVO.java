package com.xiao.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * ClassName: EmpVO <br/>
 * Description: <br/>
 * date: 2019/9/18 10:53<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@Data
public class EmpVO {
    @ColumnWidth(30)
    @ExcelProperty({"大海公司","工号"})
    private int emp_no;
    @ExcelProperty({"大海公司","部门号"})
    private String dept_no;
    @ExcelProperty({"大海公司","就职时间"})
    private String hire_date;
    @ExcelProperty({"大海公司","出生日期"})
    private String birth_date;//出生日期
    @ExcelProperty({"大海公司","姓名"})
    private String name;//姓名
    @ExcelProperty({"大海公司","性别"})
    private String gender;//性别


}

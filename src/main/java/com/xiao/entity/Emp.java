package com.xiao.entity;

import com.alibaba.excel.annotation.ExcelProperty;
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
public class Emp {
    @ExcelProperty("员工号")
    private int emp_no;
    @ExcelProperty("部门号")
    private String dept_no;
    @ExcelProperty("就职日期")
    private String from_date;
    @ExcelProperty("离职日期")
    private String to_date;

}

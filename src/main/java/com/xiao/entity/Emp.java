package com.xiao.entity;

/**
 * ClassName: Emp <br/>
 * Description: <br/>
 * date: 2019/9/17 10:47<br/>
 *  员工表的实体类
 * @author me<br />
 * @since JDK 1.8
 */
public class Emp {
    private int emp_no;
    private String dept_no;
    private String from_date;
    private String to_date;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "emp_no=" + emp_no +
                ", dept_no='" + dept_no + '\'' +
                ", from_date='" + from_date + '\'' +
                ", to_date='" + to_date + '\'' +
                '}';
    }
}

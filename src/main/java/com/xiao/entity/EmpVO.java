package com.xiao.entity;

/**
 * ClassName: EmpVO <br/>
 * Description: <br/>
 * date: 2019/9/18 10:53<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
public class EmpVO {
    private int emp_no;
    private String dept_no;
    private String from_date;
    private String to_date;
    private String birth_date;//出生日期
    private String name;//姓名
    private String gender;//性别

    @Override
    public String toString() {
        return "EmpVO{" +
                "emp_no=" + emp_no +
                ", dept_no='" + dept_no + '\'' +
                ", from_date='" + from_date + '\'' +
                ", to_date='" + to_date + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

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

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

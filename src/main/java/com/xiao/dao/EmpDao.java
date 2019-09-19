package com.xiao.dao;

import com.xiao.entity.Emp;
import com.xiao.entity.ParameterPOJO;

import java.util.List;

/**
 * ClassName: EmpDao <br/>
 * Description: <br/>
 * date: 2019/9/17 10:51<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
public interface EmpDao {
    public List<Emp> listEmp(ParameterPOJO p);
    public int countDept();
    public List<Emp > listEmpVO();

}

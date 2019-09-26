package com.xiao.dao;

import com.xiao.entity.Emp;
import com.xiao.entity.EmpVO;
import com.xiao.entity.ParameterPOJO;
import org.apache.ibatis.annotations.Param;

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
    public int countDept(ParameterPOJO p);
    public List<EmpVO> listEmpVOBySearch(ParameterPOJO p);
    public int login(@Param("username") String username, @Param("pwd") String pwd);

}

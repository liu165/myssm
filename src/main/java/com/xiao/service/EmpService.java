package com.xiao.service;

import com.xiao.entity.Emp;
import com.xiao.entity.EmpVO;
import com.xiao.entity.ParameterPOJO;

import java.util.List;

/**
 * ClassName: EmpService <br/>
 * Description: <br/>
 * date: 2019/9/17 10:52<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
public interface EmpService {
    public int countDept(ParameterPOJO p);

    public List<EmpVO> Search(ParameterPOJO p);
        public int login(String username,String pwd);
}

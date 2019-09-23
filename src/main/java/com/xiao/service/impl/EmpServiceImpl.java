package com.xiao.service.impl;

import com.xiao.dao.EmpDao;
import com.xiao.entity.Emp;
import com.xiao.entity.ParameterPOJO;
import com.xiao.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: EmpServiceImpl <br/>
 * Description: <br/>
 * date: 2019/9/17 10:53<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@Service

public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp(ParameterPOJO p) {
        return empDao.listEmp(p);
    }
    @Override
    public int countDept(){
        return empDao.countDept();
    }


    @Override
    public List<Emp> listEmpVO() {
        return empDao.listEmpVO();
    }

}

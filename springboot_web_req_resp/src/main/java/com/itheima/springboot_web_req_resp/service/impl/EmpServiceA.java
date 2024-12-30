package com.itheima.springboot_web_req_resp.service.impl;

import com.itheima.springboot_web_req_resp.dao.EmpDao;
import com.itheima.springboot_web_req_resp.pojo.Emp;
import com.itheima.springboot_web_req_resp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "lalala")
public class EmpServiceA implements EmpService {
    // ! 面向接口编程，直接用接口声明对象
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp(){

        List<Emp> emplist = empDao.listEmp();
        emplist.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)){
                emp.setGender("男");
            } else if ("2".equals(gender)){
                emp.setGender("女");
            }

            String job = emp.getJob();
            if ("1".equals(job)){
                emp.setJob("讲师");
            } else if ("2".equals(job)){
                emp.setJob("班主任");
            } else if ("3".equals(job)){
                emp.setJob("就业指导");
            }
        });

        return emplist;
    }

}

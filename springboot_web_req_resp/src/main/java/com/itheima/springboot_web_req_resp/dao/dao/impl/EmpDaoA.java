package com.itheima.springboot_web_req_resp.dao.dao.impl;

import com.itheima.springboot_web_req_resp.dao.EmpDao;
import com.itheima.springboot_web_req_resp.pojo.Emp;
import com.itheima.springboot_web_req_resp.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
@Repository
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp(){
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println("data access object " + file);
        List<Emp> emplist = XmlParserUtils.parse(file, Emp.class );
        return emplist;
    }
}

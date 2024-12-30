package com.itheima.springboot_web_req_resp.dao;

import com.itheima.springboot_web_req_resp.pojo.Emp;

import java.util.List;

public interface EmpDao {
    // 获取员工列表数据
    public List<Emp> listEmp();
}

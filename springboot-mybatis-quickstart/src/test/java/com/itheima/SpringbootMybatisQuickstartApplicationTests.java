package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EmpMapper empMapper;



    @Test
    public void testList(){
        List<User> userList = userMapper.list();
        userList.stream().forEach(user ->{
            String a = user.getName();
            System.out.println(a + user);
        });
    }

    @Test
    public void testDelete(){
        empMapper.delete(16);
    }

    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("lalala2");
        emp.setName("lalala2");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

}

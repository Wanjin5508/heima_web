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
import java.util.Arrays;
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

    @Test
    public void testList2(){
        List<Emp> empList = empMapper.list("张", (short) 1, LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1));
    }

    @Test
    public void testUpdate2(){
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom111");
        emp.setName("Tom111");
        emp.setGender((short) 1);
        emp.setImage(("1.jpg"));
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);
//        empMapper.update();
    }

    @Test
    public void testDeleteByIds(){
        List<Integer> ids = Arrays.asList(18, 19, 20);
        empMapper.deletByIds(ids);
    }

}

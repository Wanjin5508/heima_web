package com.itheima.springboot_web_req_resp.com.itheima.controller;

import com.itheima.springboot_web_req_resp.pojo.Emp;
import com.itheima.springboot_web_req_resp.pojo.Result;
import com.itheima.springboot_web_req_resp.service.EmpService;
import com.itheima.springboot_web_req_resp.service.impl.EmpServiceA;
import com.itheima.springboot_web_req_resp.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService ;

    @RequestMapping("/listEmp")
    public Result list(){

        List<Emp> emplist = empService.listEmp();
        return Result.success(emplist);
    }

//    @RequestMapping("/listEmp")
//    public Result list(){
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
//        List<Emp> emplist = XmlParserUtils.parse(file, Emp.class);
//
//        emplist.stream().forEach(emp -> {
//            String gender = emp.getGender();
//            if ("1".equals(gender)){
//                emp.setGender("男");
//            } else if ("2".equals(gender)){
//                emp.setGender("女");
//            }
//
//            String job = emp.getJob();
//            if ("1".equals(job)){
//                emp.setJob("讲师");
//            } else if ("2".equals(job)){
//                emp.setJob("班主任");
//            } else if ("3".equals(job)){
//                emp.setJob("就业指导");
//            }
//        });
//
//        return Result.success(emplist);
//    }

}

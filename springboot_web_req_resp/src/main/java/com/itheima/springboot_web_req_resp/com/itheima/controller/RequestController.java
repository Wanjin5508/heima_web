package com.itheima.springboot_web_req_resp.com.itheima.controller;

import com.itheima.springboot_web_req_resp.pojo.Result;
import com.itheima.springboot_web_req_resp.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {

//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + ": " + age);
//        return "OK";
//    }



//
//    @RequestMapping("/simpleParam")
//    public String simpleParam(@RequestParam("name") String username, Integer age) {
//        System.out.println(username + ": " + age);
//        return "OK";
//    }
//
//    @RequestMapping("/simplePojo")
//    public String simplePojo(User user){
//        System.out.println(user);
//        return "OK";
//    }
//
//    @RequestMapping("/complexPojo")
//    public String complexPojo(User user){
//        System.out.println(user);
//        return "OK";
//    }
//
//    @RequestMapping("/arrayParam")
//    public String arrayParam(String [] hobby){
//        System.out.println(Arrays.toString(hobby));
//        return "OK";
//    }
//
//    @RequestMapping("/listParam")
//    public String listParam(@RequestParam List<String> hobby){
//        System.out.println( hobby);
//        return "OK";
//    }
//
//    @RequestMapping("/dateParam")
//    public String dateParam(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")LocalDateTime updateTime){
//        System.out.println(updateTime);
//        return "OK";
//    }
//
//    @RequestMapping("/jsonParam")
//    public String jsonParam(@RequestBody User user){
//        System.out.println(user);
//        return "OK";
//    }
//
//    @RequestMapping("/path/{id}/{name}")
//    public String pathParam(@PathVariable Integer id, @PathVariable String name){
//        System.out.println(id + ": " + name);
//        return "OK";
//    }


    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("hello world");
//        return new Result(1, "success", "hello world");
        return Result.success("hello world");
    }


    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam("name") String username, Integer age) {
        System.out.println(username + ": " + age);
        return "OK";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String [] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println( hobby);
        return "OK";
    }

    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id, @PathVariable String name){
        System.out.println(id + ": " + name);
        return "OK";
    }
}

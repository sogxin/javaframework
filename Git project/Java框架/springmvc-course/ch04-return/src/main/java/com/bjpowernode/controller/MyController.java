package com.bjpowernode.controller;


import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Controller ：创建处理器对象，对象放在springmvc容器中。
 * 位置：在类的上面
 * 和spring中讲的@Service,@Component
 *
 *能处理请求的都是控制器（处理器）：MyController能处理请求，
 * 叫做后端控制器（back controller）
 */


@Controller
public class MyController {
    /**
     * 处理器方法返回String--表示逻辑视图名称，需要配置视图解析器
     *
     */
    @RequestMapping(value = "/returnString-view.do")
    public String doReturnView(HttpServletRequest request ,String name, Integer age){
        System.out.println("doReturnView,name="+name+"  age="+age);
        //可以自己手工添加数据到request作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
    //show:逻辑视图名称，项目中配置了视图解析器
        //框架对视图执行forward转发操作
     return "show";

    }

}


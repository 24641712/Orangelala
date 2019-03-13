package cn.lnu.controller.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 网页跳转
 * 实现网页的跳转部分
 * @Author：ccl
 * @Date：19-3-6
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("hello")
    public ModelAndView test(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/person/login");
//        System.out.println("我进来了");
        return model;
    }







}

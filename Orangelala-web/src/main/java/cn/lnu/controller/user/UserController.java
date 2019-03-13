package cn.lnu.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户跳转类
 * @Author： ccl
 * @Date：19-3-6
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("login")
    public ModelAndView getLogin(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/person/login");
        return model;
    }

    @RequestMapping("register")
    public ModelAndView getRegister(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/person/register");
        return model;
    }







}

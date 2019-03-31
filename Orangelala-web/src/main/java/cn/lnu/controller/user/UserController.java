package cn.lnu.controller.user;

import cn.lnu.entity.User;
import cn.lnu.service.IndexService.IndexService;
import cn.lnu.util.redis.cache.GetCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户跳转类
 * @Author： ccl
 * @Date：19-3-6
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IndexService indexService;


    @RequestMapping("/login")
    public ModelAndView getLogin(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/person/login");
        return model;
    }

    @RequestMapping("/register")
    public ModelAndView getRegister(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/person/register");
        return model;
    }

    @RequestMapping("/find")
    public void getAllUsers(){

        List<User> results = null;
        results = indexService.finAllUsers();
        ModelAndView model = new ModelAndView();
        for (User user:results){
            System.out.println(user.toString());

        }
    }

    /*
     *使用redis实现缓存功能，提高查询效率
     *@return
     **/
    @GetCache(name="room",value="id")
    @ResponseBody
    @RequestMapping("/zhujie")
    public Object getFastDFS(String id,String name){
        System.out.println("id = "+id+" name = "+name);
        System.out.println("已查询到数据，准备缓存到redis..."+
                indexService.findUserById(2L).getUsername());
        System.out.println();
        return indexService.findUserById(2L);

    }







}

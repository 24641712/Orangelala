package cn.lnu.controller.data;

import cn.lnu.entity.TbItem;
import cn.lnu.service.IndexService.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author：ccl
 * @Date：19-4-16 下午9:36
 */
@Controller
@RequestMapping("/data")
public class DataController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/item")
    public List<TbItem> getAllTbItem(){
        ModelAndView model = new ModelAndView();
        List<TbItem> list = indexService.fingAllTbItem();
        System.out.println("获取后台数据");
        System.out.println("x修改后台文件");
        System.out.println("chengdsadsfg");
        System.out.println("fenzhixiugai");
        System.out.println("主分支修改");
        System.out.println("主分支修改2223");
        return list;
    }

    public void A(){
        System.out.println("A");
    }
    public void B(){
        System.out.println("B");
    }
    public void C(){
        System.out.println("C");
    }
    public void D(){
        System.out.println("D");
    }
    public void E(){
        System.out.println("E");
    }






}

package cn.lnu.controller.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller类
 * 逻辑控制层，用于实现网页的跳转
 * 实现网页的跳转部分
 * @Author：ccl
 * @Date：19-3-6
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("address")
    public ModelAndView getAddress(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/address");
        return model;
    }

    @RequestMapping("bill")
    public ModelAndView getBill(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/bill");
        return model;
    }

    @RequestMapping("bonus")
    public ModelAndView getBonux(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/bonus");
        return model;
    }

    @RequestMapping("cardlist")
    public ModelAndView getCardlist(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/cardlist");
        return model;
    }

    @RequestMapping("change")
    public ModelAndView getChange(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/change");
        return model;
    }

    @RequestMapping("collection")
    public ModelAndView getCollection(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/collection");
        return model;
    }

    @RequestMapping("comment")
    public ModelAndView getComment(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/comment");
        return model;
    }

    @RequestMapping("consultation")
    public ModelAndView getConsultation(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/consultation");
        return model;
    }

    @RequestMapping("coupon")
    public ModelAndView getCoupon(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/coupon");
        return model;
    }

    @RequestMapping("foot")
    public ModelAndView getFoot(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/foot");
        return model;
    }

    @RequestMapping("frame")
    public ModelAndView getFrame(HttpServletRequest request){
        ModelAndView model = new ModelAndView();
        String name = request.getParameter("name");
        model.addObject("name",name);
        model.setViewName("/personal/frame");
        return model;
    }

    @RequestMapping("information")
    public ModelAndView getinformation(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/information");
        return model;
    }

    @RequestMapping("news")
    public ModelAndView getNews(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/news");
        return model;
    }

    @RequestMapping("order")
    public ModelAndView getOrder(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/order");
        return model;
    }

    @RequestMapping("points")
    public ModelAndView getPoints(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/points");
        return model;
    }

    @RequestMapping("safety")
    public ModelAndView getSafety(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/safety");
        return model;
    }

    @RequestMapping("suggest")
    public ModelAndView getSuggest(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/suggest");
        return model;
    }

    @RequestMapping("walletlist")
    public ModelAndView getWalletlist(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/personal/walletlist");
        return model;
    }

    @RequestMapping("shopcart")
    public ModelAndView getShopcart(){
        ModelAndView model = new ModelAndView();
        model.setViewName("/shopping/shopcart");
        return model;
    }


}

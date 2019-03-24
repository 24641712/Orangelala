import cn.lnu.entity.TbUser;
import cn.lnu.entity.User;
import cn.lnu.service.IndexService.IndexService;
import cn.lnu.service.userservice.UserService;
import cn.lnu.util.FormatDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 用户的展现层测试类
 * @Author：ccl
 * @Date：19-3-20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/applicationContext.xml",
        "classpath:config/spring-mvc.xml"})
public class UserControllerTest {
    @Autowired
    private IndexService indexService;

    @Autowired
    private UserService userService;


    @Test
    public void TestUsers(){
        List<User> results = indexService.finAllUsers();
        for (User user:results){
            System.out.println(user.toString());
        }
    }

    @Test
    public void AddUser(){
        User user = new User(12L,"66","66");
        int result = indexService.addUser(user);
        if(result == 1){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void updateUser(){
        User user = new User(12L,"77","77");
        int result = indexService.updateUser(user);
        if(result == 1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void findUserById(){
        User user = indexService.findUserById(12L);
        System.out.println(user.toString());
    }

    @Test
    public void deleteUser(){
        int result = indexService.deleteUsers(12L);
        if(result == 1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
            HashMap hashMap = new HashMap();
        }
    }

    @Test
    public void sendEmail(){
        userService.sendEmail();

    }

    @Test
    public void findAllTbUsers(){
        List<TbUser> list = userService.findAllTbUsers();
        for(TbUser tbUser:list){
            System.out.println(tbUser.toString());
        }
    }

    @Test
    public void addTbUser(){
        TbUser tbUser = new TbUser();
        tbUser.setId(5L);
        tbUser.setUsername("5");
        tbUser.setPassword("5");
        tbUser.setPhone("5");
        tbUser.setEmail("5");
        String strdate1="2019-05-17";
        String strdate2="2019-05-28";
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            tbUser.setCreated(sdf.parse(strdate1));
            tbUser.setUpdated(sdf.parse(strdate2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        userService.addTbUser(tbUser);
    }





}

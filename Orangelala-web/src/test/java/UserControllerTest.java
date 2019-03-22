import cn.lnu.entity.User;
import cn.lnu.service.IndexService.IndexService;
import cn.lnu.service.userservice.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

     /*
      *
      * @param null 
      * @return 
      */
    public int test(int a,int b){

        return 1;
    }



}

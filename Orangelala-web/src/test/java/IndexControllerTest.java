import cn.lnu.entity.TbItem;
import cn.lnu.service.IndexService.IndexService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author：
 * @Date：19-4-16 下午9:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/applicationContext.xml",
        "classpath:config/spring-mvc.xml"})
public class IndexControllerTest {

    @Autowired
    private IndexService indexService;

    @Test
    public void getFindAllItem(){
        List<TbItem> list=indexService.fingAllTbItem();
        for(TbItem tbItem:list){
            System.out.println(tbItem.getId());
        }

    }

    @Test
    public void getFindAllItemInfo(){
        List<TbItem> list=indexService.fingAllTbItemInfo();
        for(TbItem tbItem:list){
            System.out.println(tbItem.getId());
        }

    }




}

package cn.lnu.serviceimpl;

import cn.lnu.dao.data.DataDao;
import cn.lnu.dao.user.UserDao;
import cn.lnu.entity.TbItem;
import cn.lnu.entity.User;
import cn.lnu.service.IndexService.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户的业务逻辑层
 * @Author：ccl
 * @Date：19-3-10
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

    @Resource
    private DataDao dataDao;


    @Override
    public List<TbItem> fingAllTbItem() {
        return dataDao.fingAllTbItem();
    }

    @Override
    public List<TbItem> fingAllTbItemInfo() {
        return dataDao.fingAllTbItemInfo();
    }
}

package cn.lnu.service.IndexService;

import cn.lnu.entity.TbItem;
import cn.lnu.entity.User;

import java.util.List;

/**
 * 业务逻辑层接口
 * @Author：ccl
 * @Date：19-3-10
 */
public interface IndexService {

    public List<TbItem> fingAllTbItem();

    public List<TbItem> fingAllTbItemInfo();




}

package cn.lnu.dao.data;

import cn.lnu.entity.TbItem;

import java.util.List;

/**
 * @Author：
 * @Date：19-3-8
 */
public interface DataDao {
    public List<TbItem> fingAllTbItem();

    public List<TbItem> fingAllTbItemInfo();


}

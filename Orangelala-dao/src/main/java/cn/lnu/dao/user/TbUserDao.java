package cn.lnu.dao.user;

import cn.lnu.entity.TbUser;

import java.util.*;

/**
 *
 * @Author：ccl
 * @Date：19-3-24 上午10:59
 */
public interface TbUserDao {

    public List<TbUser> findAllTbUsers();

    public int addTbUsers(TbUser tbUser);

    public TbUser findTbUserById(Long id);

    public int updateTbUser(TbUser tbUser);

    public int deleteTbUser(Long id);

    //批量插入数据
    public int insertTbUserBatch(List<TbUser > tbUserList);

}

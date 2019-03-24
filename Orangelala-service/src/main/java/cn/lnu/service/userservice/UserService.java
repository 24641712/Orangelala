package cn.lnu.service.userservice;

import cn.lnu.dao.user.TbUserDao;
import cn.lnu.entity.TbUser;

import java.util.List;

/**
 * 用户逻辑控制接口
 * @Author：ccl
 * @Date：19-3-22 下午9:11
 */
public interface UserService {

    public void sendEmail();

    public List<TbUser> findAllTbUsers();

    public int  addTbUser(TbUser tbUser);



}

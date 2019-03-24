package cn.lnu.dao.user;

import cn.lnu.entity.TbUser;
import cn.lnu.entity.User;

import java.util.List;

/**
 * 用户数据访问层
 * @Author：ccl
 * @Date：19-3-8
 */

public interface UserDao {

    public List<User> findAllUsers();

    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(Long id);

    public User fingUserById(Long id);



}

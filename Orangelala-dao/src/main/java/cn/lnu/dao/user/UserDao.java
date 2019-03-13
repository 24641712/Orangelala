package cn.lnu.dao.user;

import cn.lnu.entity.User;

import java.util.List;

/**
 * @Author：
 * @Date：19-3-8
 */
public interface UserDao {

    List<User> findAllUsers();


}

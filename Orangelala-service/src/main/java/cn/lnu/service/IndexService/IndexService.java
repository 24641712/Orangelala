package cn.lnu.service.IndexService;

import cn.lnu.entity.User;

import java.util.List;

/**
 * 业务逻辑层接口
 * @Author：ccl
 * @Date：19-3-10
 */
public interface IndexService {

    public List<User> finAllUsers();

    public int addUser(User user);

    public int updateUser(User user);

    public User findUserById(Long id);

    public int deleteUsers(Long id);





}

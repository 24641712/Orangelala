package cn.lnu.serviceimpl;

import cn.lnu.dao.user.UserDao;
import cn.lnu.entity.User;
import cn.lnu.service.IndexService.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    private UserDao userDao;

    public List<User> finAllUsers() {
        List<User> results = null;
        results = userDao.findAllUsers();
        return results;
    }

    public int addUser(User user) {
        int result = userDao.addUser(user);

        return result;
    }

    public int updateUser(User user) {
        int result = userDao.updateUser(user);
        return result;
    }

    public User findUserById(Long id) {
        User user = userDao.fingUserById(id);
        return user;
    }

    public int deleteUsers(Long id) {
        int result = userDao.deleteUser(id);
        return result;
    }

    public String find() {
        return "hello";
    }
}

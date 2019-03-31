package cn.lnu.serviceimpl;

import cn.lnu.dao.user.TbUserDao;
import cn.lnu.entity.TbUser;
import cn.lnu.service.userservice.UserService;
import cn.lnu.util.email.CodeUtil;
import cn.lnu.util.email.SendEmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

/**
 * 用户逻辑控制实现类
 * 实现用户的添加和修改功能
 * @Author：ccl
 * @Date：19-3-22 下午9:12
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private SendEmailUtil sendEmailUtil;

    @Resource
    private TbUserDao tbUserDao;


     /*
      *发送验证连接到指定邮箱
      * @param null
      * @return
      */
    @Override
    public void sendEmail() {
        String toEmail = "ccl1712@163.com";
        String code = null;
        CodeUtil codeUtil = new CodeUtil();
        code = codeUtil.generateUniqueCode();
        try {
            sendEmailUtil.send_email(toEmail,code);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TbUser> findAllTbUsers() {

        return tbUserDao.findAllTbUsers();
    }

    @Override
    public int addTbUser(TbUser tbUser) {
        return tbUserDao.addTbUsers(tbUser);
    }

    @Override
    public TbUser findTbUserById(Long id) {
        return tbUserDao.findTbUserById(id);
    }

    @Override
    public int updateTbUser(TbUser tbUser) {
        return tbUserDao.updateTbUser(tbUser);
    }

    @Override
    public int deleteTbUser(Long id) {
        return tbUserDao.deleteTbUser(id);
    }

    @Override
    public int insertTbUserBatch(List<TbUser> tbUserList) {
        return tbUserDao.insertTbUserBatch(tbUserList);
    }


}

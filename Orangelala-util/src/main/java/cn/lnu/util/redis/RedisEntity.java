package cn.lnu.util.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author：
 * @Date：19-3-30 下午10:06
 */
@Component
public class RedisEntity {
    @Value("${redis.password}")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

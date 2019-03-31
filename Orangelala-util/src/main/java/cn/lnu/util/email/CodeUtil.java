package cn.lnu.util.email;

import java.util.UUID;

/**
 * 工具类 生成唯一激活码
 * @Author ccl
 * @Date 2018/11/18 0018 上午 8:57
 */
public class CodeUtil {
    //生成唯一的激活码
    public String generateUniqueCode(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

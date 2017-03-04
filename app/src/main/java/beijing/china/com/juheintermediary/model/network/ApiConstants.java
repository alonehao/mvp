package beijing.china.com.juheintermediary.model.network;

/**
 * 常量类
 * Created by 宋佳霖 on 2017/2/20.
 */

public class ApiConstants {
   /* 项目返回值CODE说明：

            07000：请求正确

    07010：注册账号存在

    07020：手机号验证失败

    07030：请求方式错误GET/POST

    07040：参数不能为空

    07050：登陆失败（用户名或者密码错误）

            07060：ToKen过期

    07070：未知错误
 map.put("nick_name", name);
        map.put("phone_num", phone);
        map.put("user_password", pwd);
        map.put("user_district", address);
*/
    public static final String  USER_TOKEN="user_token";
    public static final String  NICK_NAME="nick_name";
    public static final String   USER_PASSWORD="user_password";
    public static final String   PHONE_NUM="phone_num";
    public static final String   USER_DISTRICT="user_district";
    //ip
    public static final String LINK_MAIN = "http://169.254.28.80:8080/MyPaoT/";
}

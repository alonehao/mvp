package beijing.china.com.juheintermediary.model.network;

/**
 * Created by 宋佳霖 on 2017/2/20.
 */

public class ApiConfig {

    /**
     * BaseUrl
     */


    /**
     * 请求成功的标记
     */
    public static final String SUCCESS_FLAG = "请求正确";

    /**
     * 请求成功的状态码
     */
    public static final String SUCCESS_CODE = "07000";

    /**
     * 请求错误的状态码与消息
     */
    public static final String ERROE_CODE_1 = " 07020";
    public static final String ERROE_MESSAGE_1 = "手机号验证失败";

    public static final String ERROE_CODE_2 = " 07030";
    public static final String ERROE_MESSAGE_2 = "请求方式错误";

    public static final String ERROE_CODE_3 = "07040";
    public static final String ERROE_MESSAGE_3 = "参数不能为空";

    public static final String ERROE_CODE_4 = "07050";
    public static final String ERROE_MESSAGE_4 = "用户名或密码错误";

    public static final String ERROE_CODE_5 = "07060";
    public static final String ERROE_MESSAGE_5 = "toKen过期";
    public static final String ERROE_CODE_6= "07010";
    public static final String ERROE_MESSAGE_6 = "注册账号已经存在";
}

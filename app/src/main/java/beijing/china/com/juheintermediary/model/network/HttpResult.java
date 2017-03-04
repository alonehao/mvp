package beijing.china.com.juheintermediary.model.network;

/**
 * Created by 宋佳霖 on 2017/1/11.
 */

public class HttpResult<T> {

    public String code;
    public String message;
    public T userinfo;

    public String getStatus() {
        return message;
    }

    public T getData() {
        return userinfo;
    }

    public String getCode(){return code;}

    @Override
    public String toString() {
        return "HttpResult{" +
                "status='" + message + '\'' +
                ", data=" + code +
                '}';
    }
}

package beijing.china.com.juheintermediary.model.network;

import android.util.Log;

/**
 * 异常
 * Created by 宋佳霖 on 2016/10/10 11:52.
 */

public class ApiException extends RuntimeException{

    private static String message;

    public ApiException(String code) {
        super(code);
        this.getApiExceptionMessage(code);
    }

    @Override
    public String getMessage() {
        return message;
    }

    private static String getApiExceptionMessage(String code){
        Log.e("code-->",code);
        switch (code) {
             case ApiConfig.ERROE_CODE_1:
                 message = ApiConfig.ERROE_MESSAGE_1;
                 break;
            case ApiConfig.ERROE_CODE_2:
                message = ApiConfig.ERROE_MESSAGE_2;
                break;
            case ApiConfig.ERROE_CODE_3:
                message = ApiConfig.ERROE_MESSAGE_3;
                break;
            case ApiConfig.ERROE_CODE_4:
                message = ApiConfig.ERROE_MESSAGE_4;
                break;
            case ApiConfig.ERROE_CODE_5:
                message = ApiConfig.ERROE_MESSAGE_5;
                break;
            case ApiConfig.ERROE_CODE_6:
                message = ApiConfig.ERROE_MESSAGE_6;
                break;
        }
        return message;
    }
}

package beijing.china.com.juheintermediary.model.network;

import java.util.Map;

import beijing.china.com.juheintermediary.model.beans.RigesterBean;
import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 网路请求接口
 * Created by 宋佳霖 on 2017/2/20.
 */

public interface ApiService {

    //注册
    @FormUrlEncoded
    @POST("register")
    Observable<HttpResult<RigesterBean>> getRigesterData(@FieldMap Map<String, String> map);


    //登录
    @FormUrlEncoded
    @POST("login")
    Observable<HttpResult<RigesterBean>> getLoginData(@FieldMap Map<String, String> map);
}

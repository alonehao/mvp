package beijing.china.com.juheintermediary.model.network;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 获得网络请求接口事例
 * Created by 宋佳霖 on 2017/2/20.
 */

public class ApiClient {
    private static ApiService apiService;
    static  class RetrofitInstance{
        private static ApiService apiService=new Retrofit.Builder()
                .baseUrl(ApiConstants.LINK_MAIN)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(ApiService.class);

    }
    public  static ApiService getInstance(){
        return RetrofitInstance.apiService;
    }

}

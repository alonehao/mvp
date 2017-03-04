package beijing.china.com.juheintermediary.presenter;

import android.content.Context;

import beijing.china.com.juheintermediary.model.network.ApiClient;
import beijing.china.com.juheintermediary.model.network.ApiService;
import beijing.china.com.juheintermediary.view.interfaces.BaseView;


/**
 * Created by 宋佳霖 on 2017/2/20.
 */

public class BasePresenter< T extends BaseView>   {
    protected T s;
    protected Context mContext;
    protected ApiService mApiService;
    {
        mApiService= ApiClient.getInstance();

    }
    public T getView() {
        return s;
    }

    public void setView(T s, Context context ) {
        this.s = s;
        this.mContext=context;
    }

}

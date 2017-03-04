package beijing.china.com.juheintermediary.model.network;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 *网络请求方法
 * Created by 宋佳霖 on 2017/1/11.
 */

public class RxHelper {

    public static <T>void toSubscribe(Observable<HttpResult<T>> observable, final CustomSubscriber<T> subscriber){
        observable.subscribeOn(Schedulers.io())
                .map(new Function<HttpResult<T>, T>() {
                    @Override
                    public T apply(HttpResult<T> HttpResult) throws Exception {
                        if( !HttpResult.getCode().equals("07000")){
                            throw new ApiException(HttpResult.getCode());
                        }
                        return HttpResult.getData();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }




}

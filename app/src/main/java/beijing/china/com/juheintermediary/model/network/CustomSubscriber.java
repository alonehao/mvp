package beijing.china.com.juheintermediary.model.network;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.JsonSyntaxException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 被观察者
 * Created by 宋佳霖 on 2017/1/11.
 */

public abstract class CustomSubscriber<T> implements CustomProgressDialog.ProgressCancelListener,Observer<T> {

    private final Context mContext;
    private CustomProgressDialog mCpd;

    public CustomSubscriber(Context context){
        this.mContext = context;
        mCpd = new CustomProgressDialog(context,this,true);
    }

    public void showDialog(){
        if(mCpd != null){
            mCpd.show();
        }
    }

    public void dissmissDialog(){
        if(mCpd != null){
            mCpd.dissmiss();
        }
    }

    @Override
    public void onComplete() {
        dissmissDialog();
    }

    @Override
    public void onError(Throwable e) {
        if(e instanceof ApiException){
            Toast.makeText(mContext,e.getMessage(),Toast.LENGTH_SHORT).show();
        } else if ((e instanceof UnknownHostException)) {
            Toast.makeText(mContext,"网络异常",Toast.LENGTH_SHORT).show();
        } else if (e instanceof JsonSyntaxException) {
            Toast.makeText(mContext,"数据异常",Toast.LENGTH_SHORT).show();
        } else if (e instanceof SocketTimeoutException) {
            Toast.makeText(mContext,"连接超时",Toast.LENGTH_SHORT).show();
        } else if (e instanceof ConnectException) {
            Toast.makeText(mContext, "连接服务器失败", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(mContext,"未知错误",Toast.LENGTH_SHORT).show();
            Log.e("TAG","e:"+e);
        }
        dissmissDialog();
    }

    @Override
    public void onNext(T result) {
        if(result != null){
            onSuccess(result);
        }
    }

    @Override
    public void onSubscribe(Disposable d) {
        showDialog();
    }

    @Override
    public void onProgressCancel(){
          
    }

    public abstract void onSuccess(T result);
}

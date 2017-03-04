package beijing.china.com.juheintermediary.model.network;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import beijing.china.com.juheintermediary.R;


/**
 *
 * Created by 宋佳霖 on 2017/1/11.
 */

public class CustomProgressDialog {

    private static CustomProgressDialog mCpd;
    private final ProgressCancelListener mPcl;
    private final boolean mCancelable;
    private Dialog mDialog;
    private Context mContext;

    public CustomProgressDialog(Context context, ProgressCancelListener mPcl, boolean cancelable){
        this.mPcl = mPcl;
        this.mCancelable = cancelable;
        this.mContext = context;
        initDialod();
    }

//    public static CustomProgressDialog getInstance(Context context, ProgressCancelListener mPcl, boolean cancelable){
//       if(mCpd == null){
//            synchronized (CustomProgressDialog.class){
//                if(mCpd == null){
//                    mCpd = new CustomProgressDialog(context,mPcl,cancelable);
//                }
//            }
//       }
//        return mCpd;
//    }
    private void initDialod() {
       if(mDialog == null){
           mDialog = new Dialog(mContext, R.style.loadstyle);
           View view = LayoutInflater.from(mContext).inflate(R.layout.custom_dialog,null);
           mDialog.setCanceledOnTouchOutside(false);
           mDialog.setCancelable(mCancelable);
           mDialog.setContentView(view);

           //设置Dialog位置
           Window dialogWindow = mDialog.getWindow();
           dialogWindow.setGravity(Gravity.CENTER_VERTICAL
                   | Gravity.CENTER_HORIZONTAL);
       }
        mDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                if(mPcl != null){
                    mPcl.onProgressCancel();
                }
            }
        });
    }

    public void show(){
        if(mDialog != null && !mDialog.isShowing()){
            mDialog.show();
            Log.d("TAG","mDialog :"+mDialog);
        }
    }

    public void dissmiss(){
        if(mDialog != null && mDialog.isShowing()){
            mDialog.dismiss();
        }
    }

    public interface ProgressCancelListener{
        void onProgressCancel();
    }


}

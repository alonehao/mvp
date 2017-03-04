package beijing.china.com.juheintermediary.view.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import beijing.china.com.juheintermediary.application.MyApp;
import beijing.china.com.juheintermediary.presenter.BasePresenter;
import beijing.china.com.juheintermediary.utils.SpUtil;
import beijing.china.com.juheintermediary.view.interfaces.BaseView;


/**
 * fragment基类
 * Created by 宋佳霖 on 2016/12/27.
 */
public abstract class BaseFragment<T extends BasePresenter>  extends Fragment implements BaseView {
    protected T basePresenter;
    protected FragmentActivity mActivity;
    protected Context mContext;
    protected View mView;
    protected SpUtil mSpUtil;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity =  getActivity();
        mContext = getContext();
        mSpUtil=((MyApp)mActivity.getApplication()).getmSpUtil();
        basePresenter = initPersenter();

        if(basePresenter!=null){
            //接口绑定presenter
            basePresenter.setView(this,mContext);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        mView = initView(container);
        return mView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initViews();
        initDatas();
    }


    /**
     * 获得当前Persenter
     * @return
     */
    public abstract T initPersenter();




    public abstract View initView(ViewGroup container);


}

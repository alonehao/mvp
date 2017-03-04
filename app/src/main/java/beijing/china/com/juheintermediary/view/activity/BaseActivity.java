package beijing.china.com.juheintermediary.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import beijing.china.com.juheintermediary.application.MyApp;
import beijing.china.com.juheintermediary.presenter.BasePresenter;
import beijing.china.com.juheintermediary.utils.SpUtil;
import beijing.china.com.juheintermediary.view.interfaces.BaseView;
import butterknife.ButterKnife;


/**
 * activity基类
 * Created by 宋佳霖 on 2017/2/21.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {
    protected T basePresenter;
    protected Activity mContext;
    protected SpUtil mSpUtil;
    protected MyApp app;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        basePresenter = initPersenter();
        ButterKnife.bind(this);

        mContext=this;
        if (app == null) {
            app = (MyApp) getApplication();
        }
        if (mSpUtil == null) {
            mSpUtil = app.getmSpUtil();
        }
        if(basePresenter!=null){
            //接口绑定presenter
            basePresenter.setView(this,mContext);
        }
        //调用初始化控件方法
        initViews();
        //调用初始化数据方法
        initDatas();
    }
    public abstract void addActivity();

    /**
     * 获得当前加载XML
     * @return
     */
    public abstract int getLayoutID();

    /**
     * 获得当前Persenter
     * @return
     */
    public abstract T initPersenter();


}

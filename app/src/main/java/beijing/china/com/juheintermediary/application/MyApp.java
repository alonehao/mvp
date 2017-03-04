package beijing.china.com.juheintermediary.application;

import android.app.Activity;
import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;

import beijing.china.com.juheintermediary.utils.SpUtil;
import beijing.china.com.juheintermediary.views.ImageLoaderConfig;

/**
 * Created by 宋佳霖 on 2017/3/3.
 */

public class MyApp extends Application {
    private SpUtil mSpUtil;
    private ArrayList<Activity> mActivityList;

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(getApplicationContext(), ImageLoaderConfig.getImagePipelineConfig(getApplicationContext()));
        mSpUtil=SpUtil.instance(getApplicationContext());

        if (mActivityList == null) {
            mActivityList = new ArrayList<>();
        }
    }
    public SpUtil getmSpUtil() {
        return mSpUtil;
    }
    public void addActivity(Activity activity) {
        mActivityList.add(activity);
    }
    public void killActivity() {
        for (Activity activity : mActivityList) {
            if (!activity.isFinishing())  {
                activity.finish();
            }
        }
    }
}

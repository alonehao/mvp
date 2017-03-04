package beijing.china.com.juheintermediary.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 *
 * 宋佳霖
 */
public class SpUtil {
    private static SpUtil mSpUtil;
    private SharedPreferences mSp;
    
    
    public SpUtil(Context con){
    	if(mSp == null){
    		mSp = con.getSharedPreferences("property",Activity.MODE_PRIVATE);
    		
    	}
    }
    
    public static SpUtil instance(Context con){
    	
    	if(mSpUtil == null){
    		synchronized(con){
    			if(mSpUtil == null){
    				mSpUtil = new SpUtil(con);
    			}
    		}
    	}
		return mSpUtil;
    }
    
    public void setBoolean(String key,boolean value){
    	mSp.edit().putBoolean(key, value).commit();
    	
    }
    
    public boolean getBoolean(String key,boolean defValue){
    	return mSp.getBoolean(key, defValue);
    }
    
    public void setString(String key,String value){
    	mSp.edit().putString(key, value).commit();
    }
    
    public String getString(String key,String defValue){
    	return mSp.getString(key, defValue);
    }
	public void remove(String key){
		mSp.edit().remove(key).commit();
	}
}

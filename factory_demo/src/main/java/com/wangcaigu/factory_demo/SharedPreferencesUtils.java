package com.wangcaigu.factory_demo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Author：Created by Wbin on 2018/11/10
 *
 * Description：
 */
public class SharedPreferencesUtils {
    private volatile static SharedPreferencesUtils mInstance;
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    private SharedPreferencesUtils() {
    }


    public void init(Context context) {
        mPreferences = context.getApplicationContext().getSharedPreferences("cache", Context.MODE_PRIVATE);
        mEditor = mPreferences.edit();
    }

    public static SharedPreferencesUtils getInstance() {
        if (mInstance == null) {
            synchronized (SharedPreferencesUtils.class) {
                mInstance = new SharedPreferencesUtils();
            }
        }
        return mInstance;
    }


    public SharedPreferencesUtils saveString(String key, String value) {
        mEditor.putString(key, value);
        return this;
    }

    public String getString(String key) {
        return mPreferences.getString(key, "");
    }

    public void commit() {
        mEditor.commit();
    }

}


